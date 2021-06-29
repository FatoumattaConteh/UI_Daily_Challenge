package com.example.a001_basics_colorsetc.buttons;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a001_basics_colorsetc.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fab_and_More_Buttons extends AppCompatActivity {

    FloatingActionButton fab_mic,fab_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_and__more__buttons);
        fab_mic=findViewById(R.id.fab_mic);
        fab_call=findViewById(R.id.fab_call);


        ((FloatingActionButton) findViewById(R.id.fab_add)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotate=rotateFab(v,!rotate);

                if (rotate){
                    showIn(fab_mic);
                    showIn(fab_call);
                }

                else {
                    showOut(fab_mic);
                    showOut(fab_call);
                }


            }
        });
    }

    private boolean rotate=false;

    public static void showOut(final View v){
        v.setVisibility(View.VISIBLE);
        v.setAlpha(1f);
        v.setTranslationY(0);
        v.animate()
                .setDuration(200)
                .translationY(v.getHeight())
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        v.setVisibility(View.GONE);
                        super.onAnimationEnd(animation);
                    }


                }).alpha(0f)
                .start();
    }

    public  boolean rotateFab(final View v,boolean rotate){
        v.animate().setDuration(200)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationEnd(animation);
                    }


                })
                .rotation(rotate? 135f:0f);
                 return rotate;
    }


    public static void showIn(final View v){
        v.setVisibility(View.VISIBLE);
        v.setAlpha(0f);
        v.setTranslationY(v.getHeight());
        v.animate()
                .setDuration(200)
                .translationY(0)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationEnd(animation);
                    }


                }).alpha(1f)
                .start();
    }
}