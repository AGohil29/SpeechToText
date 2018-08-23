package com.example.arunr.speechtotext.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Image {

    @SerializedName("image_100x100")
    @Expose
    private List<String> image100x100 = null;

    public List<String> getImage100x100() {
        return image100x100;
    }

    public void setImage100x100(List<String> image100x100) {
        this.image100x100 = image100x100;
    }
}
