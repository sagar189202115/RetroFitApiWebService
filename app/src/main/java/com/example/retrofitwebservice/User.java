package com.example.retrofitwebservice;

class User {
    private String title,body;
    private int id,userId;

    public User(String title, String body, int id, int userId) {
        this.title = title;
        this.body = body;
        this.id = id;
        this.userId = userId;
    }

    public User() {
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }
}
