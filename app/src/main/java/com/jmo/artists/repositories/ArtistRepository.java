package com.jmo.artists.repositories;

import okhttp3.OkHttpClient;

public class ArtistRepository {
    private OkHttpClient okHttpClient;


    public ArtistRepository() {
        this.okHttpClient = new OkHttpClient();
    }

}
