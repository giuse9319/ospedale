package it.giuseppe.app.html.Entity;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Turno {

	public enum TipoTurno {
		DIURNO, NOTTURNO;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@OneToMany
	private Dipendente dipendente;
	@ManyToOne
	private Veicolo veicolo;

	private String nomeCitta;
	private String postazione;

	private OffsetDateTime inizioTurno;
	private OffsetDateTime presuntoFineTurno;
	private OffsetDateTime fineTurno;

	@CreationTimestamp
	private OffsetDateTime istanteCreazione;
	@UpdateTimestamp
	private OffsetDateTime istanteModifica;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dipendente getDipendente() {
		return dipendente;
	}

	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}

	public Veicolo getVeicolo() {
		return veicolo;
	}

	public void setVeicolo(Veicolo veicolo) {
		this.veicolo = veicolo;
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

	public OffsetDateTime getInizioTurno() {
		return inizioTurno;
	}

	public void setInizioTurno(OffsetDateTime inizioTurno) {
		this.inizioTurno = inizioTurno;
	}

	public OffsetDateTime getPresuntoFineTurno() {
		return presuntoFineTurno;
	}

	public void setPresuntoFineTurno(OffsetDateTime presuntoFineTurno) {
		this.presuntoFineTurno = presuntoFineTurno;
	}

	public OffsetDateTime getFineTurno() {
		return fineTurno;
	}

	public void setFineTurno(OffsetDateTime fineTurno) {
		this.fineTurno = fineTurno;
	}

	public OffsetDateTime getIstanteCreazione() {
		return istanteCreazione;
	}

	public void setIstanteCreazione(OffsetDateTime istanteCreazione) {
		this.istanteCreazione = istanteCreazione;
	}

	public OffsetDateTime getIstanteModifica() {
		return istanteModifica;
	}

	public void setIstanteModifica(OffsetDateTime istanteModifica) {
		this.istanteModifica = istanteModifica;
	}

	@Override
	public String toString() {
		return "Turno [id=" + id + ", dipendente=" + dipendente + ", veicolo=" + veicolo + ", nomeCitta=" + nomeCitta
				+ ", postazione=" + postazione + ", inizioTurno=" + inizioTurno + ", presuntoFineTurno="
				+ presuntoFineTurno + ", fineTurno=" + fineTurno + ", istanteCreazione=" + istanteCreazione
				+ ", istanteModifica=" + istanteModifica + "]";
	}

}
