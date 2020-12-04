package com.example.sn.intechplayertest;

import android.app.Application;
import android.content.Context;

public class ExtendedApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public void onCreate() {
        super.onCreate();
    }
}
