package com.example.externallibraries;

import android.os.Bundle;
import android.widget.Toast;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Upplevelser", "Du är en stjärna! Dela dina upplevelser", R.drawable.ic_baseline_star_24);
        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("Favoriter", "Vi gillar dig! Visa oss vad du gillar.", R.drawable.ic_baseline_favorite_24);
        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard("Vänner", "Hitta likasinnade människor som också letar efter dig!", R.drawable.ic_baseline_group_add_24);

        ahoyOnboarderCard1.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard2.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard3.setBackgroundColor(R.color.black_transparent);

        List<AhoyOnboarderCard> pages = new ArrayList<>();

        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.white);
            page.setDescriptionColor(R.color.grey_200);
        }

        //Set finish button text
        setFinishButtonTitle("Tryck Här :)");

        showNavigationControls(true);
        setGradientBackground();
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Bra jobbat!", Toast.LENGTH_SHORT).show();
    }
}