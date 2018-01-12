package com.umad.umad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.content.Context;
import android.view.View;

public class RedScreenButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redscreenbutton);
    }


    public void onClick(View view){
        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibe.vibrate(3000);
    }

}
