package com.example.sn.intechplayertest;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class ExtendedApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public void onCreate() {
        super.onCreate();
    }
}
