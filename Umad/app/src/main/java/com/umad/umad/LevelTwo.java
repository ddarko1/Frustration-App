package com.umad.umad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

public class LevelTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_two);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels / 2;

        ImageButton musicMaker = (ImageButton) findViewById(R.id.musicMaker);
        ImageButton vibrationDots = (ImageButton) findViewById(R.id.vibrationDots);
        musicMaker.getLayoutParams().height = height;
        vibrationDots.getLayoutParams().height = height;
    }

    public void onMusicClick(View view){
        Intent launcher = new Intent(this, MusicMaker.class);
        startActivity(launcher);
    }

    public void onVibrationClick(View view){
        Intent launcher = new Intent(this, VibrationDots.class);
        startActivity(launcher);
    }
}
