package it.giuseppe.app.html.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.giuseppe.app.html.Entity.Turno;

@Repository
public interface RepositoryTurno extends CrudRepository<Turno, Long> {

}