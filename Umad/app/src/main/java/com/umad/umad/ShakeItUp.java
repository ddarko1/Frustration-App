package com.umad.umad;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import android.support.annotation.AnimatorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

public class ShakeItUp extends AppCompatActivity {

    private SensorManager sensorMan;
    private SensorEventListener sensorList;
    private Sensor accelerometer;

    private float[] mGravity;
    private float mAccel;
    private float mAccelCurrent;
    private float mAccelLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake_it_up);

        final Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        TextView text = findViewById(R.id.shakeText);
        text.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));

        sensorMan = (SensorManager)getSystemService(SENSOR_SERVICE);
        accelerometer = sensorMan.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;
        sensorList = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
                    mGravity = event.values.clone();
                    // Shake detection
                    float x = mGravity[0];
                    float y = mGravity[1];
                    float z = mGravity[2];
                    mAccelLast = mAccelCurrent;
                    mAccelCurrent = (float) Math.sqrt(x*x + y*y + z*z);
                    float delta = mAccelCurrent - mAccelLast;
                    mAccel = mAccel * 0.9f + delta;

                    if(mAccel > 3){
                        vibe.vibrate(300);
                    }
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }
        };

    }

    @Override
    public void onResume() {
        super.onResume();
        sensorMan.registerListener(sensorList, accelerometer, SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorMan.unregisterListener(sensorList);
    }
}
