package com.ouakliyassine.gestiondesstocks.repository;

import com.ouakliyassine.gestiondesstocks.entites.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {


}
