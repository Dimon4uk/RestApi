package com.main.model;

import javax.persistence.*;


@Entity
@Table(name = "article_details")
public class ArticleDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    @Column(name="article_id")
    private long articleId;

    @Column(name="like_count")
    private Integer likeCount;

    @Column(name="unlike_count")
    private Integer unlikeCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getUnlikeCount() {
        return unlikeCount;
    }

    public void setUnlikeCount(Integer unlikeCount) {
        this.unlikeCount = unlikeCount;
    }


}
