package it.giuseppe.app.html.Controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.giuseppe.app.html.DTO.TurnoDTO;
import it.giuseppe.app.html.Entity.Turno;
import it.giuseppe.app.html.Service.TurnoService;

@RestController
@RequestMapping("/turni")
public class TurnoController {

	ModelMapper modelMapper;
	TurnoService turnoService;

	@Autowired
	public TurnoController(ModelMapper modelMapper, TurnoService turnoService) {

		this.modelMapper = modelMapper;
		this.turnoService = turnoService;
	}

	@GetMapping("/")
	public List<Turno> listaTurni() {
		return turnoService.leggiListaTurni();
	}

	@PostMapping("/")
	public void aggiungiTurno(@RequestBody @Valid TurnoDTO turnoDTO) {
		turnoService.aggiungiTurno(convertToEntity(turnoDTO));
	}

	@GetMapping("/{idTurni}")
	public TurnoDTO dettagliTurni(@PathVariable Long id) {
		Turno turni = turnoService.leggiTurnoById(id);
		return convertToDTO(turni);
	}

	@DeleteMapping("/{idTurni}")
	public void eliminaTurno(@PathVariable Long id) {
		turnoService.eliminaById(id);
	}

	@PutMapping("/{idTurni}")
	public void modificaTurno(@PathVariable TurnoDTO turnoDTO) {
		turnoService.modificaTurno(convertToEntity(turnoDTO));
	}

	public TurnoDTO convertToDTO(Turno turno) {
		TurnoDTO turnoDTO;
		turnoDTO = modelMapper.map(turno, TurnoDTO.class);
		return turnoDTO;
	}

	public Turno convertToEntity(TurnoDTO turnoDTO) {
		return modelMapper.map(turnoDTO, Turno.class);
	}
}
