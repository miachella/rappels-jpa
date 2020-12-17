package fr.diginamic.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Acteur {
	
	@Id
	private int id;
	@Column
	private String prenom;
	@Column
	private String nom;
	@ManyToMany
	@JoinTable(name="film_acteur",
			joinColumns = @JoinColumn(name="id_acteur", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="id_film", referencedColumnName = "id"))
	private List<Film> films = new ArrayList<>();
	
	public Acteur() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Acteur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}

}
