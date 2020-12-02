package it.giuseppe.app.html.DTO;

import it.giuseppe.app.html.Entity.Dipendente.TipoMansione;

public class DipendenteDTO {

	private Long id;
	private String nome;
	private String cognome;
	private TipoMansione tipoMansione;

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

	@Override
	public String toString() {
		return "DipendenteDTO [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", tipoMansione=" + tipoMansione
				+ "]";
	}

}
