package com.example.zipy_mobile_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.screenrecodinglibrary.ScreenRecoderModule;

public class AppClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        ScreenRecoderModule.startRecording(this);


    }
}
