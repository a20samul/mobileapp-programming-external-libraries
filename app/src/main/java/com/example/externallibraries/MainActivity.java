package com.example.externallibraries;

import android.os.Bundle;
import android.widget.Toast;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;


public class MainActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showNavigationControls(true);
        setGradientBackground();

    }

    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Bra jobbat!", Toast.LENGTH_SHORT).show();
    }
}