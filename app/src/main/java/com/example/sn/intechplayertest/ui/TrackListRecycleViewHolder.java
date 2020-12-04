package com.example.sn.intechplayertest.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.sn.intechplayertest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

class TrackListRecycleViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.track_name)
    TextView name;
    @BindView(R.id.track_artist)
    TextView artist;
    @BindView(R.id.track_cover)
    ImageView cover;

    TrackListRecycleViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}