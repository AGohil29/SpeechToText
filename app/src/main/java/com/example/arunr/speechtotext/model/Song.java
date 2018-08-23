package com.example.arunr.speechtotext.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Song {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("typeid")
    @Expose
    private Integer typeid;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("p_id")
    @Expose
    private String pId;
    @SerializedName("p_name")
    @Expose
    private String pName;
    @SerializedName("count_play")
    @Expose
    private Integer countPlay;
    @SerializedName("count_favorite")
    @Expose
    private Integer countFavorite;
    @SerializedName("image")
    @Expose
    private Image image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public Integer getCountPlay() {
        return countPlay;
    }

    public void setCountPlay(Integer countPlay) {
        this.countPlay = countPlay;
    }

    public Integer getCountFavorite() {
        return countFavorite;
    }

    public void setCountFavorite(Integer countFavorite) {
        this.countFavorite = countFavorite;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

}
