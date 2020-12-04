package com.example.sn.intechplayertest.network;

import com.example.sn.intechplayertest.models.Search;

import io.reactivex.Observable;


public class ApiFactory extends ApiBaseFactory {
    public static Observable<Search> getTrackList(String searchKeyword) {
        return getCommonService().getTrackList(searchKeyword);
    }
}
