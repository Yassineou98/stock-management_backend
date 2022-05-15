package com.ouakliyassine.gestiondesstocks.repository;

import com.ouakliyassine.gestiondesstocks.entites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Long> {

}
