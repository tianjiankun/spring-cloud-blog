package com.tian.article.service.impl;

import com.tian.article.mapper.ArticlesMapper;
import com.tian.article.pojo.Articles;
import com.tian.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public Articles getArticleById(Integer id) {
        return articlesMapper.selectByPrimaryKey(id);
    }
}
