package com.example.demorecoder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.screenrecodinglibrary.ScreenRecoderModule;

public class SecondActivity extends AppCompatActivity {

    TextView stopRecording;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stopRecording = findViewById(R.id.stopRecording);

        stopRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScreenRecoderModule.stopRecording();
            }
        });
    }
}