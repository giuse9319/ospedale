package it.giuseppe.app.html.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.giuseppe.app.html.Entity.Dipendente;

@Repository
public interface RepositoryDipendente extends CrudRepository<Dipendente, Long> {

}
