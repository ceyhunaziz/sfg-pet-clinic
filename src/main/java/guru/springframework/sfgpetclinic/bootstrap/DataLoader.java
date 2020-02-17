package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.dao.*;
import guru.springframework.sfgpetclinic.dao.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;
    private final SpecialityRepository specialityRepository;

    public DataLoader(OwnerRepository ownerRepository, VetRepository vetRepository,
                      PetTypeRepository petTypeRepository, PetRepository petRepository,
                      SpecialityRepository specialityRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
        this.specialityRepository = specialityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        boolean isTrue = petTypeRepository.findAll().iterator().hasNext();
        if (!isTrue) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeRepository.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeRepository.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityRepository.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityRepository.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityRepository.save(dentistry);

        Owner owner1 = new Owner("Jeyhun", "Azizzade");
        owner1.setAddress("M.Hadi 70");
        owner1.setCity("Baki");
        owner1.setTelephone("055-434-46-60");

        Pet pet1 = new Pet();
        pet1.setName("Murka");
        pet1.setBirthDate(LocalDate.now());
        pet1.setPetType(savedDogPetType);
        pet1.setOwner(owner1);
        owner1.getPets().add(pet1);

        Owner owner2 = new Owner("Mustafa", "Kerimov");
        owner2.setAddress("F.Qashqai 35");
        owner2.setCity("Sumqayit");
        owner2.setTelephone("051-404-96-69");

        Pet pet2 = new Pet();
        pet2.setName("Iska");
        pet2.setBirthDate(LocalDate.now().minusDays(12));
        pet2.setPetType(savedCatPetType);
        pet2.setOwner(owner2);
        owner2.getPets().add(pet2);

        petRepository.saveAll(List.of(pet1, pet2));
        ownerRepository.saveAll(List.of(owner1, owner2));

        Vet vet1 = new Vet("Musa", "Rustamov");
        vet1.getSpecialities().add(savedRadiology);
        Vet vet2 = new Vet("Vusal", "Mustafayev");
        vet2.getSpecialities().add(savedSurgery);
        vetRepository.saveAll(List.of(vet1, vet2));
    }
}
