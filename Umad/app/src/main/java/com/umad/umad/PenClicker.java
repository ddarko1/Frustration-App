package com.umad.umad;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PenClicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen_clicker);

        final ImageButton penPic = findViewById(R.id.pen);
        penPic.setTag(R.drawable.penunclickedcrop);
        penPic.setScaleType(ImageView.ScaleType.FIT_XY);

        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        penPic.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    //Down click
                    MediaPlayer player = MediaPlayer.create(PenClicker.this, R.raw.downclick);
                    vibe.vibrate(100);
                    player.start();
                    if((Integer) penPic.getTag() == R.drawable.penunclickedcrop){
                        penPic.setImageResource(R.drawable.penclickingcrop);
                        penPic.setTag(R.drawable.penclickingcrop);
                    }else{
                        penPic.setImageResource(R.drawable.penclickingcrop2);
                        penPic.setTag(R.drawable.penclickingcrop2);
                    }
                }else if (motionEvent.getAction() == MotionEvent.ACTION_UP){
                    //Up click
                    vibe.vibrate(100);
                    if((Integer) penPic.getTag() == R.drawable.penclickingcrop) {
                        penPic.setImageResource(R.drawable.penclickedcrop);
                        penPic.setTag(R.drawable.penclickedcrop);
                        MediaPlayer player = MediaPlayer.create(PenClicker.this, R.raw.clickedup);
                        player.start();
                    }else{
                        penPic.setImageResource(R.drawable.penunclickedcrop);
                        penPic.setTag(R.drawable.penunclickedcrop);
                        MediaPlayer player = MediaPlayer.create(PenClicker.this, R.raw.unclickedup);
                        player.start();
                    }
                }
                return true;
            }
        });
    }
}
