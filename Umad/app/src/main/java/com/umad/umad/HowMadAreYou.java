package com.umad.umad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HowMadAreYou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_mad_are_you);

        Button btnOne = (Button) findViewById(R.id.button);
        Button btnTwo = (Button) findViewById(R.id.button2);
        Button btnThree = (Button) findViewById(R.id.button3);
        Button btnFour = (Button) findViewById(R.id.button4);

        Toast.makeText(HowMadAreYou.this, "Long press buttons to see game selection!", Toast.LENGTH_LONG).show();

        //Button One
        btnOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch = new Intent(HowMadAreYou.this, LevelOne.class);
                startActivity(launch);
            }

        });
        btnOne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(HowMadAreYou.this, "Pen-Clicking/Switch-Flip",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        //Button Two
        btnTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch = new Intent(HowMadAreYou.this, LevelTwo.class);
                startActivity(launch);
            }

        });
        btnTwo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(HowMadAreYou.this, "Music-Maker/Vibration-Dots",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        //Button Three
        btnThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch = new Intent(HowMadAreYou.this, LevelThree.class);
                startActivity(launch);
            }

        });
        btnThree.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(HowMadAreYou.this, "Balloon Pop/Fidget Spinner",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        //Button Four
        btnFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent launch = new Intent(HowMadAreYou.this, LevelFour.class);
                startActivity(launch);
            }

        });
        btnFour.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(HowMadAreYou.this, "Shaking/Tapping",
                        Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
