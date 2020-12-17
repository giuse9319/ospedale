package it.giuseppe.app.html.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.giuseppe.app.html.Entity.Veicolo;
import it.giuseppe.app.html.Repository.RepositoryVeicolo;

@Service
public class VeicoloService {

	RepositoryVeicolo repositoryVeicolo;

	@Autowired

	public VeicoloService(RepositoryVeicolo repositoryVeicolo) {
		this.repositoryVeicolo = repositoryVeicolo;
	}

	public List<Veicolo> leggiListaDipendenti() {
		return (List<Veicolo>) repositoryVeicolo.findAll();
	}

	public void aggiungiVeicolo(Veicolo veicolo) {
		repositoryVeicolo.save(veicolo);

	}

	public Veicolo leggiDettagliVeicoloByid(Long id) {
		return repositoryVeicolo.findById(id).get();
	}

	public void deleteById(Long id) {
		repositoryVeicolo.deleteById(id);

	}

	public void modificaVeicolo(Veicolo veicolo) {
		repositoryVeicolo.save(veicolo);

	}

}
