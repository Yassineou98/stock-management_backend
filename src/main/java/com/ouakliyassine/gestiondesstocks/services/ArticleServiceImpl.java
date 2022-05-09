package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Article;
import com.ouakliyassine.gestiondesstocks.entites.Categorie;
import com.ouakliyassine.gestiondesstocks.repository.ArticleRepository;
import com.ouakliyassine.gestiondesstocks.repository.CategorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;
    private final CategorieRepository categorieRepository;

    @Override
    public void ajouterArticle(Article article) {
        if (article.getCategorie().getCategorieId() != null && article.getCategorie().getCategorieId() != 0L) {
            Categorie categorie = categorieRepository.getById(article.getCategorie().getCategorieId());
            article.setCategorie(categorie);
        }
        articleRepository.save(article);
    }

    @Override
    public void supprimerArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void modifierArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article consulterArticle(Long id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
