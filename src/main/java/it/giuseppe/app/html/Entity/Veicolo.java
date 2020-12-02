package it.giuseppe.app.html.Entity;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Veicolo {

	public enum TipoVeicolo {
		AM, MSB, MSA
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	private int codice;
	private String targa;
	private String enteDiAppartenza;
	private TipoVeicolo tipo;

	@CreationTimestamp
	private OffsetDateTime istanteCreazione;
	@UpdateTimestamp
	private OffsetDateTime istanteModifica;

	@OneToMany
	private List<NumeroDiTefono> numeroDiTelefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getEnteDiAppartenza() {
		return enteDiAppartenza;
	}

	public void setEnteDiAppartenza(String enteDiAppartenza) {
		this.enteDiAppartenza = enteDiAppartenza;
	}

	public TipoVeicolo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeicolo tipo) {
		this.tipo = tipo;
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

	public List<NumeroDiTefono> getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public void setNumeroDiTelefono(List<NumeroDiTefono> numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

	@Override
	public String toString() {
		return "Veicolo [id=" + id + ", codice=" + codice + ", targa=" + targa + ", enteDiAppartenza="
				+ enteDiAppartenza + ", tipo=" + tipo + ", istanteCreazione=" + istanteCreazione + ", istanteModifica="
				+ istanteModifica + ", numeroDiTelefono=" + numeroDiTelefono + "]";
	}

}