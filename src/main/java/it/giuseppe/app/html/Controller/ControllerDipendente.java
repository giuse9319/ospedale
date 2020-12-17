package it.giuseppe.app.html.Controller;

import java.util.List;
import java.util.stream.Collectors;

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

import it.giuseppe.app.html.DTO.DipendenteDTO;
import it.giuseppe.app.html.Entity.Dipendente;
import it.giuseppe.app.html.Service.DipendenteService;

@RestController
@RequestMapping("/dipendenti")
public class ControllerDipendente {

	DipendenteService dipendenteService;
	ModelMapper modelMapper;

	@Autowired
	public ControllerDipendente(DipendenteService dipendenteService, ModelMapper modelMapper) {
		this.dipendenteService = dipendenteService;
		this.modelMapper = modelMapper;
	}

	@GetMapping("/")
	public List<DipendenteDTO> listaDipendenti() {
		return dipendenteService.leggiListaDipendenti().stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@PostMapping("/")
	public void aggiungiDipendente(@RequestBody @Valid DipendenteDTO dipendenteDTO) {
		dipendenteService.aggiungiDipendente(convertToEntity(dipendenteDTO));
	}

	@GetMapping("/{idDipendente}")
	public DipendenteDTO dettagliDipendente(@PathVariable Long idDipendente) {
		Dipendente dipendente = dipendenteService.leggiDipendeteById(idDipendente);
		return convertToDTO(dipendente);
	}

	@DeleteMapping("/{idDipendete}")
	public void rimuoviDipendente(@PathVariable Long idDipendente) {
		dipendenteService.rimuoviDipendete(idDipendente);

	}

	@PutMapping("/{idDipendente}")
	public void modificaDipendente(@RequestBody DipendenteDTO dipendenteDTO) {
		dipendenteService.modificaDipendente(convertToEntity(dipendenteDTO));
	}

	public DipendenteDTO convertToDTO(Dipendente dipendente) {

		DipendenteDTO dipendenteDTO;
		dipendenteDTO = modelMapper.map(dipendente, DipendenteDTO.class);
		return dipendenteDTO;
	}

	public Dipendente convertToEntity(DipendenteDTO dipendenteDTO) {
		return modelMapper.map(dipendenteDTO, Dipendente.class);
	}
}
