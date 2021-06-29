package com.example.a001_basics_colorsetc.forms;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.a001_basics_colorsetc.R;
import com.example.a001_basics_colorsetc.Tools;

public class FormSignupDarkMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_signup_dark_mode);
        initToolbar();
        initComponent();
    }



    private void initToolbar() {
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this, android.R.color.black);
    }

    private void initComponent() {
        (findViewById(R.id.et_age)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAgeDialog(v);

            }
        });

        (findViewById(R.id.et_gender)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showGenderDialog(v);

            }
        });


        (findViewById(R.id.et_country)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCountryDialog(v);

            }
        });


        (findViewById(R.id.bt_submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormSignupDarkMode.this, "Submit", Toast.LENGTH_SHORT).show();

            }
        });


        (findViewById(R.id.et_age)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAgeDialog(v);

            }
        });




    }

    private void showCountryDialog(View v) {
        final String[] array=new String[]{
                "The Gambia","Bangladeshi","France"
        };
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Country");
        builder.setSingleChoiceItems(array, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((EditText) v).setText(array[which]);
                dialog.dismiss();
            }
        });
        builder.show();
    }

    private void showGenderDialog(View v) {
        final String[] array=new String[]{
                "Male","Female","Other"
        };
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Gender");
        builder.setSingleChoiceItems(array, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((EditText) v).setText(array[which]);
                dialog.dismiss();
            }
        });
        builder.show();

    }

    private void showAgeDialog(View v) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Age");
        final EditText input=new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((EditText) v).setText(input.getText().toString()+" "+"y.o");
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}