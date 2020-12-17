package fr.diginamic.beans;

import javax.persistence.Entity;

@Entity
public class Acteur extends Intervenant {
	
	private String agence;
	private double salaire;
	
	public Acteur() {
		super();
	}

	@Override
	public String toString() {
		return "Acteur [id=" + this.getId() + ", prenom=" + this.getPrenom() + ", nom=" + this.getNom() + "]";
	}

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
