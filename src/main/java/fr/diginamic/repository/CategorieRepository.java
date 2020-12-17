package fr.diginamic.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.beans.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	public Categorie findByDateMaj(LocalDate dateMaj);
}
