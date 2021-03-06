package fr.diginamic.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Film {
	
	@Id
	private int id;
	@Column
	private String titre;
	@Column
	private String annee_sortie;
	@ManyToOne
	@JoinColumn(name="id_categ")
	private Categorie categorie;
	@ManyToMany
	@JoinTable(name="film_intervenant",
			joinColumns = @JoinColumn(name="id_film", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="id_intervenant", referencedColumnName = "id"))
	private List<Intervenant> intervenants = new ArrayList<>();
	
	public Film() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}

	public String getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(String annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
