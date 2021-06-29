package com.example.a001_basics_colorsetc.lists;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.R;

public class ListMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

    }

    public void openBasicList(View view) {
        Intent i = new Intent(this, ListBasics.class);
        this.startActivity(i);
    }
}