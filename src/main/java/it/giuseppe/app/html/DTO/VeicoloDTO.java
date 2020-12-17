package it.giuseppe.app.html.DTO;

import it.giuseppe.app.html.Entity.Veicolo.TipoVeicolo;

public class VeicoloDTO {

	Long id;

	private int codice;
	private String targa;
	private String enteDiAppartenza;
	private TipoVeicolo tipo;

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

	@Override
	public String toString() {
		return "VeicoloDTO [id=" + id + ", codice=" + codice + ", targa=" + targa + ", enteDiAppartenza="
				+ enteDiAppartenza + ", tipo=" + tipo + "]";
	}

}
