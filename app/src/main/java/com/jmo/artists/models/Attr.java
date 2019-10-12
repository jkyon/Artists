package com.jmo.artists.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attr {

    @SerializedName("rank")
    @Expose
    private String rank;


    public void setRank(String rank) {
        this.rank = rank;
    }


    public String getRank() {
        return rank;
    }


}
