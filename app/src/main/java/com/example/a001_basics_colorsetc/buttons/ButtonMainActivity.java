package com.example.a001_basics_colorsetc.buttons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.R;

public class ButtonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);
    }

    public void openbasic(View view) {
        Intent i=new Intent(this, BasicButtonActivity.class);
        this.startActivity(i);


    }

    public void openutility(View view) {
        Intent i=new Intent(this, ButtonUtilityActivity.class);
        this.startActivity(i);

    }

    public void opentoggle(View view) {
        Intent i=new Intent(this, Button_Toggle_Activity.class);
        this.startActivity(i);
    }

    public void openfabButtons(View view) {
        Intent i=new Intent(this, Fab_and_More_Buttons.class);
        this.startActivity(i);
    }

}