package fr.diginamic.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {
	
	@Id
	private int id;
	@Column
	private String nom;
	@Column
	private LocalDate dateMaj;
	@OneToMany(mappedBy = "categorie")
	private List<Film> films = new ArrayList<>();
	
	public Categorie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(LocalDate dateMaj) {
		this.dateMaj = dateMaj;
	}
	
	

}
