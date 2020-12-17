package fr.diginamic.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType=DiscriminatorType.STRING, length=6)
@DiscriminatorValue("simple")
public class Tache {
	
	@Id
	private int id;
	private String description;
	private LocalDate date;
	@ManyToOne
	@JoinColumn(name="id_inter")
	private Intervenant intervenant;
	
	public Tache() {
		super();
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	

}
