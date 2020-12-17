package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import fr.diginamic.beans.Acteur;
import fr.diginamic.beans.Categorie;
import fr.diginamic.beans.Film;

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
		Acteur acteur = em.find(Acteur.class, 2);
		System.out.println(acteur);
		
		Acteur nvActeur = new Acteur();
		nvActeur.setId(8);
		nvActeur.setPrenom("Simon");
		nvActeur.setNom("Pegg");
		nvActeur.getFilms().add(em.find(Film.class, 3));
		System.out.println(nvActeur.getFilms().get(0).getTitre());
		//em.persist(nvActeur);
		
		Film film = em.find(Film.class, 4);
		film.setAnnee_sortie("2019");
		
		Film filmAjout = new Film();
		filmAjout.setTitre("couscous");
		filmAjout.setId(5);
		filmAjout.setAnnee_sortie("2048");
		Categorie categorie = em.find(Categorie.class, 8);
		filmAjout.setCategorie(categorie);
		List<Acteur> acteurs = new ArrayList<>();
		acteurs.add(acteur);
		acteurs.add(nvActeur);
		Acteur act3 = em.find(Acteur.class, 5);
		acteurs.add(act3);
		filmAjout.setActeurs(acteurs);
		//em.persist(filmAjout);
		
		Categorie cat10 = em.find(Categorie.class, 10);
		em.remove(cat10);
		Categorie cat13 = em.find(Categorie.class, 13);
		em.remove(cat13);
		
	}
}
