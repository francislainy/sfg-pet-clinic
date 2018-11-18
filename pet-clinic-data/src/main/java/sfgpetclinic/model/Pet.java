package sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType PetYpe;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetYpe() {
        return PetYpe;
    }

    public void setPetYpe(PetType petYpe) {
        PetYpe = petYpe;
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
