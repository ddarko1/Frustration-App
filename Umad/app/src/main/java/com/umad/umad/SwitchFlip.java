package com.umad.umad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.os.Vibrator;
import android.content.Context;


public class SwitchFlip extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switchflip);


    }
    public void onClickOn(View view){
        RelativeLayout background = (RelativeLayout) findViewById(R.id.backgroundId);
        background.setBackgroundColor(Color.YELLOW);
        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(300);
    }

    public void onClickOFF(View view){
        RelativeLayout background = (RelativeLayout) findViewById(R.id.backgroundId);
        background.setBackgroundColor(Color.BLACK);
        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(300);
    }
}
