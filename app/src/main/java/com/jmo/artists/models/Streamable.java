package com.jmo.artists.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Streamable {



    @SerializedName("#text")
    @Expose
    private String text;
    @SerializedName("fulltrack")
    @Expose
    private String fulltrack;


    public void setText(String text) {
        this.text = text;
    }

    public void setFulltrack(String fulltrack) {
        this.fulltrack = fulltrack;
    }

    public String getText() {
        return text;
    }


    public String getFulltrack() {
        return fulltrack;
    }


}
