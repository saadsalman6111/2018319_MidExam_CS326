package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class Data {

    private int userId;
    private int id;
    private String title;

    @SerializedName("body")
    private String name;

    public Data(int userId, int id, String title, String name) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }



    public String getTitle() {
        return title;
    }


}


