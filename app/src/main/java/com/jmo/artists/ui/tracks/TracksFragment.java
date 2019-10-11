package com.jmo.artists.ui.tracks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jmo.artists.R;
import com.jmo.artists.models.Track;
import com.jmo.artists.models.Tracks;
import com.jmo.artists.ui.adapters.TrackAdapter;
import com.jmo.artists.ui.artists.ArtistViewModel;

import java.util.List;

public class TracksFragment extends Fragment {

    private RecyclerView recyclerView;
    private TrackAdapter adapter;
    private TrackViewModel TrackViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TrackViewModel =
                ViewModelProviders.of(this).get(TrackViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tracks, container, false);


        recyclerView = root.findViewById(R.id.trackRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        TrackViewModel.getTracks().observe(this, new Observer<Tracks>() {
            @Override
            public void onChanged(Tracks tracks) {
                adapter = new TrackAdapter(getActivity(), tracks.getTracks());
                recyclerView.setAdapter(adapter);
            }
        });
        return root;
    }
}