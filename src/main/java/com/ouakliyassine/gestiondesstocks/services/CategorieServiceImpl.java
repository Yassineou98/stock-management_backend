package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Article;
import com.ouakliyassine.gestiondesstocks.entites.Categorie;
import com.ouakliyassine.gestiondesstocks.repository.CategorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    @Override
    public void ajoutercategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public void supprimercategorie(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public void modifiercategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    @Override
    public Categorie consultercategorie(Long id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public List<Categorie> getAll() {
        return categorieRepository.findAll();
    }
}
