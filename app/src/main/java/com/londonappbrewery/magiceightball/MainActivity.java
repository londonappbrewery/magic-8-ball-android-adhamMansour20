package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Array Hold All ball Images
        final int[] ball_images = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // Create The Random Value And Max Value
        final int max = 5;

        final Random randomNumberGenerator = new Random();

        // Get Design Elements
        final ImageView ball = findViewById(R.id.ball);
        final Button ask_button =findViewById(R.id.ask_button);

        // Add Event Listener For The Button

        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // With Every Click, We Will Have New random Number That Help us To Have New Random Image From The Array
                int randomNum = randomNumberGenerator.nextInt(max);
                ball.setImageResource(ball_images[randomNum]); // Update The Image
            }
        });

    }
}
