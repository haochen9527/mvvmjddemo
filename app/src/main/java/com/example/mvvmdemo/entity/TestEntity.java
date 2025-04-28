package com.example.mvvmdemo.entity;

public class TestEntity {

    private String title;
    private String introduce;

    public TestEntity(String title, String introduce) {
        this.title = title;
        this.introduce = introduce;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
