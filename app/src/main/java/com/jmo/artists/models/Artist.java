package com.jmo.artists.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("mbid")
    @Expose
    private String mbid;
    @SerializedName("url")
    @Expose
    private String url;


    public Artist(String name, String mbid, String url) {
        super();
        this.name = name;
        this.mbid = mbid;
        this.url = url;
    }

    public String getName() {
        return name;
    }


    public String getMbid() {
        return mbid;
    }


    public String getUrl() {
        return url;
    }



}
