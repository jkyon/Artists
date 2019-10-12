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


    public Track(String name, String duration, String listeners, String mbid, String url, Streamable streamable, Artist artist, List<Image> image, Attr attr) {
        super();
        this.name = name;
        this.duration = duration;
        this.listeners = listeners;
        this.mbid = mbid;
        this.url = url;
        this.streamable = streamable;
        this.artist = artist;
        this.image = image;
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


