package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.diginamic.beans.Film;

@EnableJpaRepositories
public interface FilmRepository extends JpaRepository<Film, Integer> {
	
	public Film findByTitre(String titre);

}
