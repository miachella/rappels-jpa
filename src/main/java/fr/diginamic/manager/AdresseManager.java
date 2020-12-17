package fr.diginamic.manager;

import org.springframework.stereotype.Service;

import fr.diginamic.beans.Adresse;

@Service
public class AdresseManager {
	
	private static Adresse adresse = new Adresse();
	
	public static Adresse getInstance(int id, int numeroRue, String libelleRue, String ville, int codePostal) {
		adresse.setId(id);
		adresse.setNumeroRue(numeroRue);
		adresse.setLibelleRue(libelleRue);
		adresse.setVille(ville);
		adresse.setCodePostal(codePostal);
		return adresse;
	}

}
