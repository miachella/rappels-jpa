package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.diginamic.beans.Acteur;

@EnableJpaRepositories
public interface ActeurRepository extends JpaRepository<Acteur, Integer>{
	
	public Acteur findByNomAndPrenom(String nom, String prenom);

}
