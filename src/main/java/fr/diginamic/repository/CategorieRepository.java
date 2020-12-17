package fr.diginamic.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.diginamic.beans.Categorie;

@EnableJpaRepositories
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	public Categorie findByDateMaj(LocalDate dateMaj);
}
