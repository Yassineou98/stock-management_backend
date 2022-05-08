package com.ouakliyassine.gestiondesstocks.repository;


import com.ouakliyassine.gestiondesstocks.entites.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {


}
