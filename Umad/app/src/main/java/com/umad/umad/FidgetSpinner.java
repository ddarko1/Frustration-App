package com.umad.umad;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class FidgetSpinner extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fidget_spinner);

    }

    public void AnimClick(View v) {
        final MediaPlayer mySong1 = MediaPlayer.create(this, R.raw.fidget);
        mySong1.start();
        ImageView animationTarget = (ImageView) this.findViewById(R.id.testImage);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotation_fidget);
        animationTarget.startAnimation(animation);
        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(300);
    }


}
