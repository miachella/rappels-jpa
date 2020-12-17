package fr.diginamic.manager;

import java.time.LocalDate;

import fr.diginamic.beans.Tache;
import fr.diginamic.beans.TacheDatee;

public class TacheManager {
	
	private static Tache tache = new Tache();
	private static TacheDatee tacheDatee = new TacheDatee();
	
	public static Tache getTache(String description, LocalDate date) {
		tache.setDescription(description);
		tache.setDate(date);
		return tache;
	}
	
	public static TacheDatee getTacheDatee(String description, LocalDate date, LocalDate dateEcheance) {
		tacheDatee.setDescription(description);
		tacheDatee.setDate(date);
		tacheDatee.setDateEcheance(dateEcheance);
		return tacheDatee;
	}

}
