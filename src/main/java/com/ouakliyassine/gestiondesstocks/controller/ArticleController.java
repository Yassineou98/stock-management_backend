package com.ouakliyassine.gestiondesstocks.controller;


import com.ouakliyassine.gestiondesstocks.entites.Article;
import com.ouakliyassine.gestiondesstocks.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    List<Article> getAllArticles() {
        return articleService.getAll();
    }

    @GetMapping("/{id}")
    Article getArticleById(@PathVariable Long id) {
        return articleService.consulterArticle(id);
    }

    @PostMapping
    void saveArticle(@RequestBody Article article) {
        articleService.ajouterArticle(article);
    }

    @PutMapping
    void updateArticle(@RequestBody Article article){
        articleService.modifierArticle(article);
    }

    @DeleteMapping("/{id}")
    void deleteArticle(@PathVariable Long id ){
        articleService.supprimerArticle(id);
    }


}
