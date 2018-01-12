package com.umad.umad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MusicMaker extends AppCompatActivity {
    ImageButton bt1;
    ImageButton bt2;
    ImageButton bt3;
    ImageButton bt4;
    ImageButton bt5;
    ImageButton bt6;
    ImageButton bt7;
    ImageButton bt8;
    ImageButton bt9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_maker);
        bt1 = (ImageButton) findViewById(R.id.button);
        bt2 = (ImageButton) findViewById(R.id.button2);
        bt3 = (ImageButton) findViewById(R.id.button3);
        bt4 = (ImageButton) findViewById(R.id.button4);
        bt5 = (ImageButton) findViewById(R.id.button5);
        bt6 = (ImageButton) findViewById(R.id.button6);
        bt7 = (ImageButton) findViewById(R.id.button7);
        bt8 = (ImageButton) findViewById(R.id.button8);
        bt9 = (ImageButton) findViewById(R.id.button9);
        final MediaPlayer mySong1 = MediaPlayer.create(this, R.raw.dog);
        final MediaPlayer mySong2 = MediaPlayer.create(this, R.raw.lamb);
        final MediaPlayer mySong3 = MediaPlayer.create(this, R.raw.duck);
        final MediaPlayer mySong4 = MediaPlayer.create(this, R.raw.cow);
        final MediaPlayer mySong5 = MediaPlayer.create(this, R.raw.pig);
        final MediaPlayer mySong6 = MediaPlayer.create(this, R.raw.owl);
        final MediaPlayer mySong7 = MediaPlayer.create(this, R.raw.rooster);
        final MediaPlayer mySong8 = MediaPlayer.create(this, R.raw.crow);
        final MediaPlayer mySong9 = MediaPlayer.create(this, R.raw.cats);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong1.start();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong2.start();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong3.start();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong4.start();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong5.start();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong6.start();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong7.start();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong8.start();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mySong9.start();
            }
        });
    }
}
