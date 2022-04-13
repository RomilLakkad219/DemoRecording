package com.example.zipy_mobile_sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.screenrecodinglibrary.ScreenRecoderModule;

public class MainActivity extends AppCompatActivity {

    TextView txtStartRecoding, txtStopRecoding, txtNextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtStartRecoding =  findViewById(R.id.txtStartRecoding);
        txtStopRecoding = findViewById(R.id.txtStopRecoding);
        txtNextScreen = findViewById(R.id.txtNextScreen);


        txtNextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

//        txtStartRecoding.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ScreenRecoderModule.startRecording(MainActivity.this);
//            }
//        });
//
    }
}