package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.dao.PetTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


}
