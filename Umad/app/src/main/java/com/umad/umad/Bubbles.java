package com.umad.umad;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class Bubbles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubbles);

        final MediaPlayer balloon = MediaPlayer.create(this, R.raw.balloon_pop);
        final MediaPlayer balloon2 = MediaPlayer.create(this, R.raw.balloon_pop);
        final MediaPlayer balloon3 = MediaPlayer.create(this, R.raw.balloon_pop);
        final MediaPlayer balloon4 = MediaPlayer.create(this, R.raw.balloon_pop);
        final MediaPlayer balloon5 = MediaPlayer.create(this, R.raw.balloon_pop);
        final Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);



        final Button btn = (Button) findViewById(R.id.balloon);
        final Button btn1 = (Button) findViewById(R.id.balloon2);
        final Button btn2 = (Button) findViewById(R.id.balloon3);
        final Button btn3 = (Button) findViewById(R.id.balloon4);
        final Button btn4 = (Button) findViewById(R.id.balloon5);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setVisibility(View.INVISIBLE);
                balloon.start();
                btn1.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                v.vibrate(100);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setVisibility(View.INVISIBLE);
                balloon2.start();
                btn.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                v.vibrate(100);



            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                btn2.setVisibility(View.INVISIBLE);
                balloon3.start();
                btn1.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                v.vibrate(100);


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3.setVisibility(View.INVISIBLE);
                balloon4.start();
                btn1.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn4.setVisibility(View.VISIBLE);
                v.vibrate(100);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                btn4.setVisibility(View.INVISIBLE);
                balloon5.start();
                btn1.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
                btn2.setVisibility(View.VISIBLE);
                btn3.setVisibility(View.VISIBLE);
                v.vibrate(100);


            }
        });


    }
}
