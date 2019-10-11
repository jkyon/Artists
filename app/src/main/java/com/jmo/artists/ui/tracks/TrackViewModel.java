package com.jmo.artists.ui.tracks;

import com.jmo.artists.models.Tracks;
import com.jmo.artists.repositories.TrackApi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TrackViewModel extends ViewModel {

    private MutableLiveData<Tracks> trackList;

    public TrackViewModel() {
        trackList = new MutableLiveData<Tracks>();
    }

    public LiveData<Tracks> getTracks() {

        loadTracks();

        return trackList;
    }

    private void loadTracks(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ws.audioscrobbler.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TrackApi trackApi = retrofit.create(TrackApi.class);

        Call<Tracks> call = trackApi.getTracks();

        call.enqueue(new Callback<Tracks>() {
            @Override
            public void onResponse(Call<Tracks> call, Response<Tracks> response) {

                Tracks resp = response.body();
                trackList.setValue(resp);
            }

            @Override
            public void onFailure(Call<Tracks> call, Throwable t) {
                int val = 0;
                Throwable tr = t;
            }
        });
    }
}