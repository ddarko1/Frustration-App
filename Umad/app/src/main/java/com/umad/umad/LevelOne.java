package com.umad.umad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;

public class LevelOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels / 2;

        ImageButton penClick = (ImageButton) findViewById(R.id.penClick);
        ImageButton switchFlip = (ImageButton) findViewById(R.id.switchFlip);
        penClick.getLayoutParams().height = height;
        switchFlip.getLayoutParams().height = height;
    }

    public void onPenClick(View view){
        Intent launcher = new Intent(this, PenClicker.class);
        startActivity(launcher);
    }

    public void onSwitchClick(View view){
        Intent launcher = new Intent(this, SwitchFlip.class);
        startActivity(launcher);
    }
}
