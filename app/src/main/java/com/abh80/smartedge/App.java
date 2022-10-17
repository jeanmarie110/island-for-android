package com.abh80.smartedge;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}
