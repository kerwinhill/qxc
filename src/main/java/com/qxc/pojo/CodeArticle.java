package com.qxc.pojo;

public class CodeArticle {
    private Integer id;

    private String articletime;

    private String title;

    private String content;

    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticletime() {
        return articletime;
    }

    public void setArticletime(String articletime) {
        this.articletime = articletime == null ? null : articletime.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}