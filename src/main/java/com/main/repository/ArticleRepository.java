package com.main.repository;

import com.main.model.Article;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Дмитрий on 21.11.2016.
 */
public interface ArticleRepository extends CrudRepository<Article,Long> {



}