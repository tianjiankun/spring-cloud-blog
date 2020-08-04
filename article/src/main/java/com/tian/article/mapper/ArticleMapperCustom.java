package com.tian.article.mapper;

import com.tian.article.pojo.vo.ArticleVO;

import java.util.List;

public interface ArticleMapperCustom{
    public List<ArticleVO> getArticleList(Integer cate_id);
}
