package com.firekernel.musicplayer;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by Ashish on 5/15/2017.
 * Main Multidex application
 */

public class FireApplication extends Application {
    public static Context appContext;

    public static Context getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        //FireLog.d(TAG, "(++) onCreate");
        super.onCreate();
        appContext = getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
