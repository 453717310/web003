package cn.bdqn.bean;

import java.util.Date;

/**
 * Created by dll on 2017/7/27.
 */
public class News_comment {
    private Integer id;//评论编号；
    private Integer newsId;//新闻编号
    private String content;//评论内容
    private String author;//评论人
    private Date createDate;//评论时间

    public News_comment(Integer id, Integer newsId, String content, String author, Date createDate) {
        this.id = id;
        this.newsId = newsId;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
    }

    public News_comment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "News_comment{" +
                "id=" + id +
                ", newsId=" + newsId +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
