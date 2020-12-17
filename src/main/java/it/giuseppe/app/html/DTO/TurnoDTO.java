package it.giuseppe.app.html.DTO;

import java.util.List;

import it.giuseppe.app.html.Entity.Dipendente;
import it.giuseppe.app.html.Entity.Turno.TipoTurno;
import it.giuseppe.app.html.Entity.Veicolo;

public class TurnoDTO {

	private Long id;
	private String nomeCitta;
	private String postazione;
	private TipoTurno tipoTurno;
	private Veicolo veicolo;
	private List<Dipendente> dipendenti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCitta() {
		return nomeCitta;
	}

	public void setNomeCitta(String nomeCitta) {
		this.nomeCitta = nomeCitta;
	}

	public String getPostazione() {
		return postazione;
	}

	public void setPostazione(String postazione) {
		this.postazione = postazione;
	}

	public TipoTurno getTipoTurno() {
		return tipoTurno;
	}

	public void setTipoTurno(TipoTurno tipoTurno) {
		this.tipoTurno = tipoTurno;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

	@Override
	public String toString() {
		return "TurnoDTO [id=" + id + ", nomeCitta=" + nomeCitta + ", postazione=" + postazione + ", tipoTurno="
				+ tipoTurno + ", veicolo=" + veicolo + ", dipendenti=" + dipendenti + "]";
	}

}
