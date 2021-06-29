package com.example.a001_basics_colorsetc.model;

import android.graphics.drawable.Drawable;

public class Books {

    public int image;
    public Drawable imageDrw;
    public String name;
    public String email;
    public boolean section = false;

    public Books() {

    }

    public Books(String name, boolean section) {
        this.name = name;
        this.section = section;
    }
}
