package com.android.relaxcloud.model;

/**
 * Created by DangQuang on 10/28/17.
 **/

public class MenuModel {

    private Integer image;
    private String title;
    private String color;

    public MenuModel(Integer image, String title, String color) {
        this.image = image;
        this.title = title;
        this.color = color;
    }

    public String getTitle() {
        return title != null ? title : "";
    }

    public Integer getImage() {
        return image != null ? image : 0;
    }

    public String getColor() {
        return color;
    }
}
