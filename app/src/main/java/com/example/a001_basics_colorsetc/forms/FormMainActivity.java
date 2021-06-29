package com.example.a001_basics_colorsetc.forms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.R;

public class FormMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_main);
    }

    public void openLogin(View view) {

            Intent i=new Intent(this, FormLoginActivity.class);
            this.startActivity(i);

    }

    public void openSigup(View view) {

        Intent i=new Intent(this, FormSignUp.class);
        this.startActivity(i);
    }

    public void openFormWithIcons(View view) {

        Intent i=new Intent(this, FormProfileWithIcons.class);
        this.startActivity(i);
    }

    public void openFormTextArea(View view) {
        Intent i=new Intent(this, FormTextArea.class);
        this.startActivity(i);
    }

    public void openFormAddress(View view) {

        Intent i=new Intent(this, FormAddress.class);
        this.startActivity(i);
    }

    public void openFormEcommerce(View view) {

        Intent i=new Intent(this,FormEcommerce.class);
        this.startActivity(i);

    }

    public void openFormCardSignUp(View view) {

        Intent i=new Intent(this,FormCardSignUp.class);
        this.startActivity(i);
    }

    public void openFormCardSignUpWithBackgroundImage(View view) {

        Intent i=new Intent(this,FormSignUpCardWithBackgroundImage.class);
        this.startActivity(i);
    }


    public void openFormSignUpInDarkMode(View view) {
        Intent i=new Intent(this,FormSignupDarkMode.class);
        this.startActivity(i);
    }

    public void openFormSignUpImage(View view) {
        Intent i=new Intent(this,FormSignUpImage.class);
        this.startActivity(i);
    }

    public void openFormAddProductInAProject(View view) {
        Intent i=new Intent(this,FormAddProductInAProject.class);
        this.startActivity(i);
    }
}