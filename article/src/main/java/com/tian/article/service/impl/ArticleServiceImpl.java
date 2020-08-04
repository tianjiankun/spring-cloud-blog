package com.tian.article.service.impl;

import com.tian.article.mapper.ArticleMapperCustom;
import com.tian.article.mapper.ArticlesMapper;
import com.tian.article.pojo.Articles;
import com.tian.article.pojo.vo.ArticleVO;
import com.tian.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticlesMapper articlesMapper;

    @Autowired
    private ArticleMapperCustom articleMapperCustom;

    @Override
    public Articles getArticleById(Integer id) {
        return articlesMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ArticleVO> getArticleList(Integer cate_id) {


        return articleMapperCustom.getArticleList(cate_id);
    }
}
