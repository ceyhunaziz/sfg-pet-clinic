package guru.springframework.sfgpetclinic.dao;

import guru.springframework.sfgpetclinic.dao.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
