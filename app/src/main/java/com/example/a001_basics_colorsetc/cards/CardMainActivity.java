package com.example.a001_basics_colorsetc.cards;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.R;

public class CardMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_main);


    }



    public void openClickableCards(View view) {
        Intent i=new Intent(this, ClickableCards.class);
        this.startActivity(i);

    }

    public void openCArdOverlap(View view) {

        Intent i=new Intent(this, CardOverlap.class);
        this.startActivity(i);
    }

    public void openCardSplahScreen(View view) {
        Intent i=new Intent(this, CardSplashScreen.class);
        this.startActivity(i);
    }

    public void openCardBasics(View view) {

            Intent i=new Intent(this, CardBasic.class);
            this.startActivity(i);

    }
}