package fr.diginamic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.diginamic.beans.Acteur;
import fr.diginamic.beans.Adresse;
import fr.diginamic.beans.Categorie;
import fr.diginamic.beans.Film;
import fr.diginamic.beans.Intervenant;
import fr.diginamic.beans.Producteur;
import fr.diginamic.beans.Realisateur;
import fr.diginamic.beans.Tache;
import fr.diginamic.beans.TacheDatee;
import fr.diginamic.manager.AdresseManager;
import fr.diginamic.manager.FilmManager;
import fr.diginamic.manager.IntervenantManager;
import fr.diginamic.manager.TacheManager;

@SpringBootApplication
@EnableTransactionManagement
public class Main implements CommandLineRunner {
	
	@PersistenceContext
	private EntityManager em;

	public static void main(String[] args) {

		SpringApplication.run(Main.class, args);
		
		
	}

	@Override 
	@Transactional
	public void run(String... args) throws Exception {
//		Acteur acteur = em.find(Acteur.class, 2);
//		System.out.println(acteur);
//		
//		Acteur nvActeur = new Acteur();
//		nvActeur.setId(8);
//		nvActeur.setPrenom("Simon");
//		nvActeur.setNom("Pegg");
//		nvActeur.getFilms().add(em.find(Film.class, 3));
//		System.out.println(nvActeur.getFilms().get(0).getTitre());
//		em.persist(nvActeur);
//		
//		Film film = em.find(Film.class, 4);
//		film.setAnnee_sortie("2019");
//		
//		Film filmAjout = new Film();
//		filmAjout.setTitre("couscous");
//		filmAjout.setId(5);
//		filmAjout.setAnnee_sortie("2048");
//		Categorie categorie = em.find(Categorie.class, 8);
//		filmAjout.setCategorie(categorie);
//		List<Acteur> acteurs = new ArrayList<>();
//		acteurs.add(acteur);
//		acteurs.add(nvActeur);
//		Acteur act3 = em.find(Acteur.class, 5);
//		acteurs.add(act3);
//		filmAjout.setActeurs(acteurs);
		//em.persist(filmAjout);
		
		//Categorie cat10 = em.find(Categorie.class, 10);
		//em.remove(cat10);
		//Categorie cat13 = em.find(Categorie.class, 13);
		//em.remove(cat13);
		
		
		Tache t1 = TacheManager.getTache("Aller voir le médecin du travail", LocalDate.now());
//		em.persist(t1);
		TacheDatee t2 = TacheManager.getTacheDatee("Apprendre le texte", LocalDate.now(), LocalDate.of(2021, 01, 15));
		em.persist(t2);
		
		Adresse a = AdresseManager.getInstance(1, 198, "rue de Vaugirard", "Paris", 75015);
		em.persist(a);
		
		List<Intervenant> list = new ArrayList<>();
		Acteur a1 = IntervenantManager.getActeur(1, "Christine", "oulala", "Acter&Co", 25.3);
		a1.setTaches(Arrays.asList(t1));
		em.persist(a1);
		Acteur a2 = IntervenantManager.getActeur(2, "Christiane", "oulala", "Acter&Co", 250.3);
		a2.setTaches(Arrays.asList(t2));
		em.persist(a2);
		Acteur a3 = IntervenantManager.getActeur(3, "Christophe", "oulala", "Acter&Co", 2500.3);
		a3.setAdresse(a);
		em.persist(a3);
		Realisateur r = IntervenantManager.getRealisateur(10, "Mike", "Doe", 126000.39);
		Producteur p = IntervenantManager.getProducteur(20, "Frank", "Sinatra", 1000500.99);
		em.persist(p);
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(p);
		list.add(r);
		
		Categorie categorie = new Categorie();
		categorie.setId(1);
		categorie.setNom("Comédie");
		categorie.setDateMaj(LocalDate.now());
		em.persist(categorie);
		
		Film f = FilmManager.getInstance(50, "Les oiseaux chantent le ciel est bleu", "2096", categorie, list);
		em.persist(f);
		
	}
}
