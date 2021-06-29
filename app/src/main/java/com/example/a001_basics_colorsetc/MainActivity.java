package com.example.a001_basics_colorsetc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.buttons.ButtonMainActivity;
import com.example.a001_basics_colorsetc.cards.CardMainActivity;
import com.example.a001_basics_colorsetc.forms.FormMainActivity;
import com.example.a001_basics_colorsetc.lists.ListMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openButtons(View view) {

        Intent i=new Intent(this, ButtonMainActivity.class);
        this.startActivity(i);
    }


    public void openCards(View view) {

        Intent i=new Intent(this, CardMainActivity.class);
        this.startActivity(i);
    }


    public void openForms(View view) {

        Intent i=new Intent(this, FormMainActivity.class);
        this.startActivity(i);
    }


    public void openLists(View view) {
        Intent i=new Intent(this, ListMainActivity.class);
        this.startActivity(i);
    }
}