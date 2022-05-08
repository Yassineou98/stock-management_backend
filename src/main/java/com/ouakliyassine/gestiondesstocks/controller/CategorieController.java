package com.ouakliyassine.gestiondesstocks.controller;


import com.ouakliyassine.gestiondesstocks.entites.Categorie;
import com.ouakliyassine.gestiondesstocks.services.CategorieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;

    @GetMapping
    List<Categorie> getAllCategories() {
        return categorieService.getAll();
    }

    @GetMapping("/{id}")
    Categorie getCategorieById(@PathVariable Long id) {
        return categorieService.consultercategorie(id);
    }

    @PostMapping
    void saveCategorie(@RequestBody Categorie categorie) {
        categorieService.ajoutercategorie(categorie);
    }

    @PutMapping
    void updateCategorie(@RequestBody Categorie categorie){
        categorieService.modifiercategorie(categorie);
    }

    @DeleteMapping("/{id}")
    void deleteCategorie(@PathVariable Long id ){
        categorieService.supprimercategorie(id);
    }


}
