package com.main.controller;

import com.main.model.Article;
import com.main.model.ArticleDetails;
import com.main.repository.ArticleDetailsRepository;
import com.main.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequestMapping(value = "/articles", produces = "application/json")
@CrossOrigin(allowCredentials = "false")
@RestController
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleDetailsRepository articleDetailsRepository;

    @RequestMapping("/")
    public Iterable<Article>  articles() {
        return StreamSupport.stream(articleRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
   }

    @RequestMapping(value = "/{id}")
    public Article article(@PathVariable long id) {
        return articleRepository.findOne(id);
    }

    @RequestMapping("/details/{id}")
    public ArticleDetails articleDetails(@PathVariable long id) {
        return articleDetailsRepository.findOne(id);
    }

}
