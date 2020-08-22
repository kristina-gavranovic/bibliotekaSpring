package net.codejava.autor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long autorID;

	private String ime;
	private String prezime;
	private String zemlja;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(Long autorID, String ime, String prezime, String zemlja) {
		super();
		this.autorID = autorID;
		this.ime = ime;
		this.prezime = prezime;
		this.zemlja = zemlja;
	}

	public Long getAutorID() {
		return autorID;
	}

	public void setAutorID(Long autorID) {
		this.autorID = autorID;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getZemlja() {
		return zemlja;
	}

	public void setZemlja(String zemlja) {
		this.zemlja = zemlja;
	}
	
	
	
}
