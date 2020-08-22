package net.codejava.lice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long liceID;

	private String ime;
	private String prezime;
	private String pol;
	private String datumrodjenja;
	private String email;
	private String adresa;
	private String mesto;

	protected Lice() {
	}


	public Lice(String ime, String prezime, String pol, String datumrodjenja, String email, String adresa,
			String mesto) {
		this.ime = ime;
		this.prezime = prezime;
		this.pol = pol;
		this.datumrodjenja = datumrodjenja;
		this.email = email;
		this.adresa = adresa;
		this.mesto = mesto;
	}

	public Long getLiceID() {
		return liceID;
	}

	public void setLiceID(Long liceID) {
		this.liceID = liceID;
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

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String getDatumrodjenja() {
		return datumrodjenja;
	}

	public void setDatumrodjenja(String datumrodjenja) {
		this.datumrodjenja = datumrodjenja;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	

}
