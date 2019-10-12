package com.jmo.artists.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tracks {

    @SerializedName("track")
    List<Track> track;

    public void setTrack(List<Track> track) {
        this.track = track;
    }

    public List<Track> getTracks() {

        return track;
    }
}
