package com.ouakliyassine.gestiondesstocks.services;

import com.ouakliyassine.gestiondesstocks.entites.Article;
import com.ouakliyassine.gestiondesstocks.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Override
    public void ajouterArticle(Article article) {
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
