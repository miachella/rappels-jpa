package fr.diginamic.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("datee")
public class TacheDatee extends Tache {
	
	private LocalDate dateEcheance;

	public TacheDatee() {
		super();
	}

	public LocalDate getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(LocalDate dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	

}
