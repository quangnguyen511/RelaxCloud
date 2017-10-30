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
    private String duration;

    public String getTitle() {
        return title != null ? title : "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration != null ? duration : "";
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
