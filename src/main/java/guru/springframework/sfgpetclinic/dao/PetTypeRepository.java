package guru.springframework.sfgpetclinic.dao;

import guru.springframework.sfgpetclinic.dao.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
