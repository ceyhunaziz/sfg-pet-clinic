package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.dao.OwnerRepository;
import guru.springframework.sfgpetclinic.dao.VetRepository;
import guru.springframework.sfgpetclinic.dao.model.Owner;
import guru.springframework.sfgpetclinic.dao.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;

    public DataLoader(OwnerRepository ownerRepository, VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("Jeyhun", "Azizzade");
        Owner owner2 = new Owner("Mustafa", "Kerimov");
        ownerRepository.saveAll(List.of(owner1, owner2));

        Vet vet1 = new Vet("Musa", "Rustamov");
        Vet vet2 = new Vet("Vusal", "Mustafayev");
        vetRepository.saveAll(List.of(vet1, vet2));
    }
}
