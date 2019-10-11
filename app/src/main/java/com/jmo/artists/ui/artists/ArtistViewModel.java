package com.jmo.artists.ui.artists;

import com.jmo.artists.models.Track;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArtistViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ArtistViewModel() {
        mText = new MutableLiveData<String>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}