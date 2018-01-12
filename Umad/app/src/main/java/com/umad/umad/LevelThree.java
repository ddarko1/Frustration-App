package com.umad.umad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

public class LevelThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels / 2;

        ImageButton balloonPop = (ImageButton) findViewById(R.id.balloonPop);
        ImageButton fidgetSpinner = (ImageButton) findViewById(R.id.fidgetSpinner);
        balloonPop.getLayoutParams().height = height;
        fidgetSpinner.getLayoutParams().height = height;
    }

    public void onBalloonClick(View view){
        Intent launcher = new Intent(this, Bubbles.class);
        startActivity(launcher);
    }

    public void onSpinClick(View view){
        Intent launcher = new Intent(this, FidgetSpinner.class);
        startActivity(launcher);
    }
}
