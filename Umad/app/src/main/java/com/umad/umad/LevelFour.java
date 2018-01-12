package com.umad.umad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

public class LevelFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels / 2;

        ImageButton tapster = (ImageButton) findViewById(R.id.tapster);
        ImageButton shakeIt = (ImageButton) findViewById(R.id.shakeIt);
        tapster.getLayoutParams().height = height;
        shakeIt.getLayoutParams().height = height;
    }

    public void onTapClick(View view){
        Intent launcher = new Intent(this, RedScreenButton.class);
        startActivity(launcher);
    }

    public void onShakeClick(View view){
        Intent launcher = new Intent(this, ShakeItUp.class);
        startActivity(launcher);
    }
}
