package com.umad.umad;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VibrationDots extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);
        final Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final MediaPlayer piano1 = MediaPlayer.create(this, R.raw.pianosound1);
        final MediaPlayer piano2 = MediaPlayer.create(this, R.raw.pianosound2);
        final MediaPlayer piano3 = MediaPlayer.create(this, R.raw.pianosound3);
        final MediaPlayer guitar1 = MediaPlayer.create(this, R.raw.guitar1);
        final MediaPlayer guitar2 = MediaPlayer.create(this, R.raw.guitar2);
        final MediaPlayer guitar3 = MediaPlayer.create(this, R.raw.guitar3);
        final MediaPlayer drum1 = MediaPlayer.create(this, R.raw.drum);
        final MediaPlayer drum2 = MediaPlayer.create(this, R.raw.drum2);
        final MediaPlayer drum3 = MediaPlayer.create(this, R.raw.drum3);




        //Button order starts from top left then goes to the right of the row and down to the next row.
        final Button btn1 = (Button) findViewById(R.id.button);
        final Button btn2 = (Button) findViewById(R.id.button22);
        final Button btn3 = (Button) findViewById(R.id.button26);
        final Button btn4 = (Button) findViewById(R.id.button19);
        final Button btn5 = (Button) findViewById(R.id.button25);
        final Button btn6 = (Button) findViewById(R.id.button24);
        final Button btn7 = (Button) findViewById(R.id.button20);
        final Button btn8 = (Button) findViewById(R.id.button21);
        final Button btn9 = (Button) findViewById(R.id.button23);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.vibrate(100);
                piano1.start();


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                v.vibrate(200);
                piano2.start();


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.vibrate(300);
                piano3.start();


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 100, 100, 100};
                v.vibrate(pattern, -1);
                guitar1.start();


            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 1000, 200, 1000};
                v.vibrate(pattern, -1);
                guitar3.start();



            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 700, 100, 700};
                v.vibrate(pattern, -1);
                guitar2.start();


            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 100, 100, 100,100,100};
                v.vibrate(pattern, -1);
                drum1.start();


            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 700, 100, 700,100,700};
                v.vibrate(pattern, -1);
                drum2.start();


            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long[] pattern = {0, 1000, 100, 1000,100,1000};
                v.vibrate(pattern, -1);
                drum3.start();

            }
        });



    }
}
