package com.example.sn.intechplayertest.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sn.intechplayertest.R;
import com.example.sn.intechplayertest.models.Track;

import java.util.List;

public class TrackListRecycleAdapter extends RecyclerView.Adapter<TrackListRecycleViewHolder> {
    private Context context;
    private List<Track> list;

    private final OnItemClickListener mOnItemClickListener;

    private final View.OnClickListener mInternalListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Track test = (Track) view.getTag();
            mOnItemClickListener.onItemClick(view, test);
        }
    };

    TrackListRecycleAdapter(Context context, List<Track> list, @NonNull OnItemClickListener onItemClickListener) {
        this.list = list;
        this.context = context;
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override
    public TrackListRecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_list_track, viewGroup, false);
        return new TrackListRecycleViewHolder(view);
    }

    public void onBindViewHolder(TrackListRecycleViewHolder holder, int position) {
        Track track = list.get(position);
        holder.name.setText(track.getTrackName());
        holder.artist.setText(track.getArtistName());
        Glide.with(context).load(track.getArtworkUrl100()).into(holder.cover);
        holder.itemView.setOnClickListener(mInternalListener);
        holder.itemView.setTag(track);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    interface OnItemClickListener {
        void onItemClick(@NonNull View view, @NonNull Track test);
    }
}