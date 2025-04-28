package com.example.mvvmdemo.entity;

public class ProductEntity {

    private String image;
    private String introduce;

    public ProductEntity(String introduce, String image) {
        this.image = image;
        this.introduce = introduce;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
