package it.giuseppe.app.html.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.giuseppe.app.html.Entity.Veicolo;

@Repository
public interface RepositoryVeicolo extends CrudRepository<Veicolo, Long> {

}
