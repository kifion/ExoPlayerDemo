package com.example.sn.intechplayertest.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.sn.intechplayertest.R;
import com.example.sn.intechplayertest.models.Search;
import com.example.sn.intechplayertest.models.Track;
import com.example.sn.intechplayertest.network.ApiFactory;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class TrackListActivity extends AppCompatActivity implements TrackListRecycleAdapter.OnItemClickListener  {

    @BindView(R.id.list_track)
    RecyclerView recyclerView;

    @BindView(R.id.list_search)
    SearchView searchView;

    @BindView(R.id.list_progress_bar)
    ProgressBar progressBar;

    private Disposable disposable;
    TrackListRecycleAdapter adapter;
    public static final int SEARCH_SYMBOL_LIMIT = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                System.out.println("query:" + query);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText.length() >= SEARCH_SYMBOL_LIMIT) {
                    loadTracks(newText);
                }
                return false;
            }
        });
    }

    private void loadTracks(String query) {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);

        disposable = ApiFactory.getTrackList(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorReturn(throwable -> {
                    Toast.makeText(this, "Network error", Toast.LENGTH_LONG).show();
                    return null;
                })
                .subscribe(this::done, throwable -> {});
    }

    private void done(Search tracks) {
        adapter = new TrackListRecycleAdapter(this, tracks.getResults(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }
    @Override
    public void onItemClick(@NonNull View view, @NonNull Track track) {
        nextActivity(track);
    }

    public void nextActivity(Track track) {
        Intent i = new Intent(TrackListActivity.this, PlayerActivity.class);
        i.putExtra(Track.class.getCanonicalName(), track);
        startActivity(i);
    }
}
