package com.android.kaviapp.Activities;

/**
 * Created by dell on 11-10-2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.android.kaviapp.R;

import java.util.Timer;
import java.util.TimerTask;


public class SplashScreenActivity extends Activity {

    // Set Duration of the Splash Screen
    long Delay = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove the Title Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Get the view from splash_screen.xml
        setContentView(R.layout.activity_splash);

        // Create a Timer
        Timer RunSplash = new Timer();

        // Task to do when the timer ends
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                // Close SplashScreenActivity.class
                finish();

                // Start MainActivity.class
                Intent myIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(myIntent);
            }
        };

        // Start the timer
        RunSplash.schedule(ShowSplash, Delay);
    }
}