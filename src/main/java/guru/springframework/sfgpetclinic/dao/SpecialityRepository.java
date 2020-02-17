package guru.springframework.sfgpetclinic.dao;

import guru.springframework.sfgpetclinic.dao.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
