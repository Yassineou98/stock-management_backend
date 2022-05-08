package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Article;
import com.ouakliyassine.gestiondesstocks.entites.Categorie;

import java.util.List;

public interface CategorieService {

    void ajoutercategorie(Categorie categorie);
    void supprimercategorie(Long id);
    void modifiercategorie(Categorie categorie);
    Categorie consultercategorie(Long id);
    List<Categorie> getAll();
}
