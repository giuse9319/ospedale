package it.giuseppe.app.html.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.giuseppe.app.html.Entity.Dipendente;
import it.giuseppe.app.html.Repository.RepositoryDipendente;

@Service
public class DipendenteService {

	RepositoryDipendente dipendenteRepository;

	@Autowired
	public DipendenteService(RepositoryDipendente dipendenteRepository) {
		this.dipendenteRepository = dipendenteRepository;
	}

	public List<Dipendente> leggiListaDipendenti() {
		return (List<Dipendente>) dipendenteRepository.findAll();
	}

	public void aggiungiDipendente(Dipendente dipendenti) {
		dipendenteRepository.save(dipendenti);
	}

	public Dipendente leggiDipendeteById(Long idDipendente) {
		return dipendenteRepository.findById(idDipendente).get();

	}

	public void rimuoviDipendete(Long idDipendente) {
		dipendenteRepository.deleteById(idDipendente);

	}

	public void modificaDipendente(Dipendente dipendente) {
		dipendenteRepository.save(dipendente);

	}

}
