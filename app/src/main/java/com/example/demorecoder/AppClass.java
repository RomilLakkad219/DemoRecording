package com.example.demorecoder;

import android.app.Application;

import com.example.screenrecodinglibrary.ScreenRecoderModule;

public class AppClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        ScreenRecoderModule.startRecording(this);


    }
}
