package com.tian.article.service;


import com.tian.article.pojo.Articles;
import com.tian.article.pojo.vo.ArticleVO;

import java.util.List;

public interface ArticleService {
    public Articles getArticleById(Integer id);

    public List<ArticleVO> getArticleList(Integer cate_id);
}
