package com.jmo.artists.models;


import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.List;


public class Track {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("listeners")
    @Expose
    private String listeners;
    @SerializedName("mbid")
    @Expose
    private String mbid;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("streamable")
    @Expose
    private Streamable streamable;
    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("image")
    @Expose
    private List<Image> image;

    @SerializedName("@attr")
    @Expose
    private Attr attr;


    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStreamable(Streamable streamable) {
        this.streamable = streamable;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }



    public String getName() {
        return name;
    }


    public String getDuration() {
        return duration;
    }


    public String getListeners() {
        return listeners;
    }


    public String getMbid() {
        return mbid;
    }


    public String getUrl() {
        return url;
    }


    public Streamable getStreamable() {
        return streamable;
    }


    public Artist getArtist() {
        return artist;
    }



    public List<Image> getImage() {
        return image;
    }



    public Attr getAttr() {
        return attr;
    }



}


