package com.android.relaxcloud.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by DangQuang on 10/30/17.
 **/

public class SoundModel implements Serializable {
    @SerializedName("title")
    private String title;
    @SerializedName("duration")
    private Integer duration;
    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url != null ? url : "";
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title != null ? title : "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration != null ? duration : 0;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
