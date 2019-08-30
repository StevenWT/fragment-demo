package com.steven.fragment;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

public class FragmentApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fragmentation.builder()
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
             .install();
    }
}
