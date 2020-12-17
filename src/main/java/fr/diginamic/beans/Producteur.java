package fr.diginamic.beans;

import javax.persistence.Entity;

@Entity
public class Producteur extends Intervenant {
	
	private double budget;

	public Producteur() {
		super();
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

}
