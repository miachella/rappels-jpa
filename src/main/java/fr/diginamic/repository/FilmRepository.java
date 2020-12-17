package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.beans.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {
	
	public Film findByNom(String nom);

}
