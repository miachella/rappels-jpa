package fr.diginamic.manager;

import fr.diginamic.beans.Acteur;
import fr.diginamic.beans.Producteur;
import fr.diginamic.beans.Realisateur;

public class IntervenantManager {
	
	private static Acteur acteur = new Acteur();
	private static Producteur producteur = new Producteur();
	private static Realisateur realisateur = new Realisateur();
	
	public static Acteur getActeur(int id, String prenom, String nom, String agence, double salaire) {
		acteur.setId(id);
		acteur.setPrenom(prenom);
		acteur.setNom(nom);
		acteur.setAgence(agence);
		acteur.setSalaire(salaire);
		return acteur;
	}
	
	public static Producteur getProducteur(int id, String prenom, String nom, double budget) {
		producteur.setId(id);
		producteur.setPrenom(prenom);
		producteur.setNom(nom);
		producteur.setBudget(budget);
		return producteur;
	}
	
	public static Realisateur getRealisateur(int id, String prenom, String nom, double commission) {
		realisateur.setId(id);
		realisateur.setPrenom(prenom);
		realisateur.setNom(nom);
		realisateur.setCommission(commission);
		return realisateur;
	}

}
