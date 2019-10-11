package com.jmo.artists.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jmo.artists.R;
import com.jmo.artists.models.Track;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class TrackAdapter extends RecyclerView.Adapter<TrackViewHolder> {

    private Context context;
    private List<Track> trackList;

    public TrackAdapter(Context context, List<Track> trackList) {
        this.context = context;
        this.trackList = trackList;
    }

    @NonNull
    @Override
    public TrackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.track_card_view_layout, parent, false);
        return new TrackViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrackViewHolder holder, int position) {
        Track track = trackList.get(position);

        //Picasso.get().load(track.getImageUrl()).into(holder.imageView);

        holder.textView.setText(track.getName());
    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }
}

class TrackViewHolder extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView textView;

    public TrackViewHolder(@NonNull View itemView) {

        super(itemView);

        imageView = itemView.findViewById(R.id.trackImageView);
        textView = itemView.findViewById(R.id.txvTrackName);
    }
}
