package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.dao.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}
