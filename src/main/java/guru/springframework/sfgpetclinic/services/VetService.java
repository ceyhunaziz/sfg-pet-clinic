package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.dao.VetRepository;
import guru.springframework.sfgpetclinic.dao.model.Vet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetService {
    private final VetRepository vetRepository;

    public VetService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    public List<Vet> findAll() {
        return vetRepository.findAll();
    }
}
