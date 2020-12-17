package fr.diginamic.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Adresse {
	
	@Id
	private int id;
	private int numeroRue;
	private String libelleRue;
	private String ville;
	private int codePostal;
	@OneToOne
	@JoinColumn(name = "id_int")
	private Intervenant intervenant;
	
	public Adresse() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroRue() {
		return numeroRue;
	}
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	public String getLibelleRue() {
		return libelleRue;
	}
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

}
