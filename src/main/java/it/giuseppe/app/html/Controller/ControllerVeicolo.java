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

import it.giuseppe.app.html.DTO.VeicoloDTO;
import it.giuseppe.app.html.Entity.Veicolo;
import it.giuseppe.app.html.Service.VeicoloService;

@RestController
@RequestMapping("/veicoli")
public class ControllerVeicolo {

	VeicoloService serviceVeicolo;
	ModelMapper modelMapper;

	@Autowired
	public ControllerVeicolo(VeicoloService serviceVeicolo, ModelMapper modelMapper) {
		this.serviceVeicolo = serviceVeicolo;
		this.modelMapper = modelMapper;
	}

	@GetMapping("/")
	public List<Veicolo> listaVeicoli() {
		return serviceVeicolo.leggiListaDipendenti();

	}

	@PostMapping("/")
	public void aggiungiVeicolo(@RequestBody @Valid VeicoloDTO veicoloDTO) {
		serviceVeicolo.aggiungiVeicolo(convertToEntity(veicoloDTO));

	}

	@GetMapping("/{idVeicolo}")
	public VeicoloDTO dettagliUtente(@PathVariable Long id) {
		Veicolo veicolo = serviceVeicolo.leggiDettagliVeicoloByid(id);
		return convertToDTO(veicolo);
	}

	@DeleteMapping("/{idVeicolo}")
	public void rimuoviVeicolo(@PathVariable Long id) {
		serviceVeicolo.deleteById(id);
	}

	@PutMapping("/{idVeicolo}")
	public void modificaVeicolo(@RequestBody VeicoloDTO veicoloDTO) {
		serviceVeicolo.modificaVeicolo(convertToEntity(veicoloDTO));
	}

	private Veicolo convertToEntity(VeicoloDTO veicoloDTO) {
		return modelMapper.map(veicoloDTO, Veicolo.class);
	}

	private VeicoloDTO convertToDTO(Veicolo veicolo) {
		VeicoloDTO veicoloDTO;
		veicoloDTO = modelMapper.map(veicolo, VeicoloDTO.class);
		return veicoloDTO;
	}

}
