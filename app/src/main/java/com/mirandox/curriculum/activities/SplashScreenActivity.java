package com.mirandox.curriculum.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.mirandox.curriculum.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mainView();
            }
        }, 3000);

    }

    private void mainView() {
        Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
