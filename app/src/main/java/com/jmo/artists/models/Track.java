package com.jmo.artists.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Track {

    @SerializedName("name")
    private String name;

    @SerializedName("duration")
    private String duration;

    @SerializedName("url")
    private String url;

    @SerializedName("artist")
    private Artist artist;

    @SerializedName("mbid")
    private String mbid;

    @SerializedName("streamable")
    private Streamable streamable;
    //private String imageUrl;

    private List<Image> image;

    public Track(String name, String duration, String url, Artist artist,/*, String imageUrl*/String mbid, Streamable streamable, List<Image> image) {
        this.name = name;
        this.duration = duration;
        this.url = url;
        this.artist = artist;
        this.mbid = mbid;
        this.streamable = streamable;
        //this.imageUrl = imageUrl;
        this.image = image;
        this.mbid = mbid;
    }


    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getUrl() {
        return url;
    }


    public Artist getArtist() {
        return artist;
    }

    public List<Image> getImage() {
        return image;
    }

    public String getMbid() {
        return mbid;
    }

    public Streamable getStreamable() {
        return streamable;
    }

    /*public String getImageUrl() {
        return imageUrl;
    }*/


}


class Artist {
    @SerializedName("name")
    private String name;

    @SerializedName("url")
    private String url;

    public Artist(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}


class Image {

    @SerializedName("#text")
    private String text;

    @SerializedName("#size")
    private String size;

    public String getText() {
        return text;
    }


    public String getSize() {
        return size;
    }

}


class Streamable {
    @SerializedName("#text")
    private String text;

    @SerializedName("fulltrack")
    private String fulltrack;

    Streamable(String text, String fulltrack) {
        this.text = text;
        this.fulltrack = fulltrack;
    }

    public String getText() {
        return text;
    }

    public String getFulltrack() {
        return fulltrack;
    }
}