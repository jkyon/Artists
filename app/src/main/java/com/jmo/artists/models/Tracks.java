package com.jmo.artists.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tracks {

    @SerializedName("track")
    private List<Track> track;

    public Tracks(List<Track> tracks) {

        this.track = tracks;
    }

    public List<Track> getTracks() {

        return track;
    }
}
