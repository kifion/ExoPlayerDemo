package com.example.sn.intechplayertest.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.sn.intechplayertest.R;

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