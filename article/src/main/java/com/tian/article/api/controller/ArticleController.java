package com.tian.article.api.controller;

import com.tian.article.common.utils.JsonResult;
import com.tian.article.pojo.Articles;
import com.tian.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/{id}")
    public JsonResult getArticleById(@PathVariable Integer id) {

        Articles article = articleService.getArticleById(id);
        return JsonResult.ok(article);

    }

}
