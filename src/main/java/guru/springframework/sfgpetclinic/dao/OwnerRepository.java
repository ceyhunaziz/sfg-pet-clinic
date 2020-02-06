package guru.springframework.sfgpetclinic.dao;

import guru.springframework.sfgpetclinic.dao.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
