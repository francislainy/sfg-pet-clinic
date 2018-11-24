package sfgpetclinic.services;

import sfgpetclinic.model.Owner;
import sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    VetService findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
