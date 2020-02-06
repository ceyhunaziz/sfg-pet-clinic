package guru.springframework.sfgpetclinic.dao;

import guru.springframework.sfgpetclinic.dao.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
