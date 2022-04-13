package com.example.screenrecodinglibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.screenrecodinglibrary.service.OnClearFromRecentService;

public class BaseActivity extends AppCompatActivity implements StopRecordingInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ScreenRecoderModule.startScreenRecoder(BaseActivity.this, BaseActivity.this);
        startService(new Intent(BaseActivity.this, OnClearFromRecentService.class));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            ScreenRecoderModule.activityResult(requestCode, resultCode, data, BaseActivity.this);
        } else {
            Toast.makeText(BaseActivity.this, "User Cancel Request", Toast.LENGTH_SHORT).show();
        }
        onBackPressed();
    }

    @Override
    public void onStopRecording() {
        ScreenRecoderModule.stopScreenRecoder(BaseActivity.this);
    }
}