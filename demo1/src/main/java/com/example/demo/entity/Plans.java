package com.example.demo.entity;

public class Plans {

    private Integer id;
    private String title;
    private String headtitle;
    private String textcontent;
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }

    public String getHeadtitle() {
        return headtitle;
    }

    public void setHeadtitle(String headtitle) {
        this.headtitle = headtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
