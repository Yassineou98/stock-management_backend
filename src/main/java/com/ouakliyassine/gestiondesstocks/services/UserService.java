package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Utilisateur;

import java.util.List;

public interface UserService {

    void ajouteruser(Utilisateur user);
    void supprimeruser(Long id);
    void modifieruser(Utilisateur user);
    Utilisateur consulteruser(Long id);
    List<Utilisateur> getAll();
}
