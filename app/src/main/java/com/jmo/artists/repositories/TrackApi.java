package com.jmo.artists.repositories;
import com.jmo.artists.models.Tracks;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TrackApi {

    @GET("2.0/?method=geo.gettoptracks&country=spain&api_key=829751643419a7128b7ada50de590067&format=json")
    Call<Tracks> getTracks();
}
