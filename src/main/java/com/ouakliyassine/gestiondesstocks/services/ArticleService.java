package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Article;

import java.util.List;

public interface ArticleService {

    void ajouterArticle(Article article);
    void supprimerArticle(Long id);
    void modifierArticle(Article article);
    Article consulterArticle(Long id);
    List<Article> getAll();

}
