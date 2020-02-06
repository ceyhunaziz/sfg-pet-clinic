package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.dao.OwnerRepository;
import guru.springframework.sfgpetclinic.dao.model.Owner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }
}
