package fr.diginamic.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Intervenant {
	
	@Id
	private int id;
	@Column
	private String prenom;
	@Column
	private String nom;
	@ManyToMany
	@JoinTable(name="film_intervenant",
			joinColumns = @JoinColumn(name="id_intervenant", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="id_film", referencedColumnName = "id"))
	private List<Film> films = new ArrayList<>();
	@OneToOne
	private Adresse adresse;
	@OneToMany(mappedBy = "intervenant")
	private List<Tache> taches = new ArrayList<>();
	
	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
