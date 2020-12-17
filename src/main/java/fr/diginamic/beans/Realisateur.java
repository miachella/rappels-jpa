package fr.diginamic.beans;

import javax.persistence.Entity;

@Entity
public class Realisateur extends Intervenant {
	
	private double commission;

	public Realisateur() {
		super();
	}
	
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}


}
