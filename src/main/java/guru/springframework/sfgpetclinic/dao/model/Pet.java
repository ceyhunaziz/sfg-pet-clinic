package guru.springframework.sfgpetclinic.dao.model;

import javax.persistence.*;
import java.io.Serializable;

import java.time.LocalDate;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private PetType petType;
    @Lob
    private Owner owner;
    private LocalDate birthDate;

    public Pet() {
    }

    public Pet(PetType petType, Owner owner, LocalDate birthDate) {
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
