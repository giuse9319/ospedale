package it.giuseppe.app.html.Entity;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Dipendente {

	public enum TipoMansione {

		BARELLIERE, INFERMIERE, MEDICO, AUTISTA
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	private String nome;
	private String cognome;
	private TipoMansione tipoMansione;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public TipoMansione getTipoMansione() {
		return tipoMansione;
	}

	public void setTipoMansione(TipoMansione tipoMansione) {
		this.tipoMansione = tipoMansione;
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
		return "Dipendente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", tipoMansione=" + tipoMansione
				+ ", istanteCreazione=" + istanteCreazione + ", istanteModifica=" + istanteModifica + "]";
	}

}
