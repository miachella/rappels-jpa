package fr.diginamic.manager;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.diginamic.beans.Categorie;
import fr.diginamic.beans.Film;
import fr.diginamic.beans.Intervenant;

@Service
public class FilmManager {
	
	private static Film film = new Film();
	
	public static Film getInstance(int id, String titre, String annee_sortie, Categorie categorie, List<Intervenant> intervenants){
		film = new Film();
		film.setId(id);
		film.setTitre(titre);
		film.setAnnee_sortie(annee_sortie);
		film.setCategorie(categorie);
		film.setIntervenants(intervenants);
		return film;
	}

}
