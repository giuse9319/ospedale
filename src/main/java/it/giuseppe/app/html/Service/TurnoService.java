package it.giuseppe.app.html.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.giuseppe.app.html.Entity.Turno;
import it.giuseppe.app.html.Entity.Veicolo;
import it.giuseppe.app.html.Repository.RepositoryTurno;

@Service
public class TurnoService {

	RepositoryTurno turnoRepository;

	@Autowired
	public TurnoService(RepositoryTurno turnoRepository) {
		this.turnoRepository = turnoRepository;
	}

	public List<Turno> leggiListaTurni() {
		return (List<Turno>) turnoRepository.findAll();
	}

	public void aggiungiTurno(Turno turno) {

		// List<Turno> listaTurni = new ArrayList<>();
		List<Veicolo> listaVeicolo = new ArrayList<>();

		Boolean flag;
		if (turno.getInizioTurno().equals(listaVeicolo) && turno.getFineTurno().equals(listaVeicolo)) {
			flag = false;
		} else {
			flag = true;
			turnoRepository.save(turno);
		}

	}

	public Turno leggiTurnoById(Long id) {
		return turnoRepository.findById(id).get();
	}

	public void eliminaById(Long id) {
		turnoRepository.deleteById(id);
	}

	public void modificaTurno(Turno turno) {
		turnoRepository.save(turno);
	}

}
