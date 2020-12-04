package com.example.sn.intechplayertest.network;

import com.example.sn.intechplayertest.Constants;
import com.example.sn.intechplayertest.models.Search;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET(Constants.Url.Track.SEARCH)
    Observable<Search> getTrackList(
            @Query(Constants.Attribute.Track.SEARCH_KEYWORD) String searchKeyword
    );
}
