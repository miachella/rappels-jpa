package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.beans.Acteur;

public interface ActeurRepository extends JpaRepository<Acteur, Integer>{
	
	public Acteur findByNomAndPrenom(String nom, String prenom);

}
