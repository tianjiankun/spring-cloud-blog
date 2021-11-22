package com.tian.article.pojo;

import javax.persistence.*;
import java.util.Date;

public class Articles {
    /**
     * 文章表主键
     */
    @Id
    private Integer id;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    private Byte categoryId;

    /**
     * 标题
     */
    private String title;

    /**
     * slug
     */
    private String slug;

    /**
     * 作者
     */
    private String author;

    /**
     * 描述
     */
    private String description;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 封面图
     */
    private String cover;

    /**
     * 是否置顶 1是 0否
     */
    @Column(name = "is_top")
    private Byte isTop;

    private Integer views;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    /**
     * markdown文章内容
     */
    private String markdown;

    /**
     * markdown转的html页面
     */
    private String html;

    /**
     * 获取文章表主键
     *
     * @return id - 文章表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文章表主键
     *
     * @param id 文章表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类id
     *
     * @return category_id - 分类id
     */
    public Byte getCategoryId() {
        return categoryId;
    }

    /**
     * 设置分类id
     *
     * @param categoryId 分类id
     */
    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取slug
     *
     * @return slug - slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置slug
     *
     * @param slug slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取关键词
     *
     * @return keywords - 关键词
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置关键词
     *
     * @param keywords 关键词
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * 获取封面图
     *
     * @return cover - 封面图
     */
    public String getCover() {
        return cover;
    }

    /**
     * 设置封面图
     *
     * @param cover 封面图
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 获取是否置顶 1是 0否
     *
     * @return is_top - 是否置顶 1是 0否
     */
    public Byte getIsTop() {
        return isTop;
    }

    /**
     * 设置是否置顶 1是 0否
     *
     * @param isTop 是否置顶 1是 0否
     */
    public void setIsTop(Byte isTop) {
        this.isTop = isTop;
    }

    /**
     * @return views
     */
    public Integer getViews() {
        return views;
    }

    /**
     * @param views
     */
    public void setViews(Integer views) {
        this.views = views;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 获取markdown文章内容
     *
     * @return markdown - markdown文章内容
     */
    public String getMarkdown() {
        return markdown;
    }

    /**
     * 设置markdown文章内容
     *
     * @param markdown markdown文章内容
     */
    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    /**
     * 获取markdown转的html页面
     *
     * @return html - markdown转的html页面
     */
    public String getHtml() {
        return html;
    }

    /**
     * 设置markdown转的html页面
     *
     * @param html markdown转的html页面
     */
    public void setHtml(String html) {
        this.html = html;
    }
}