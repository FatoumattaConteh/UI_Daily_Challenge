package com.example.a001_basics_colorsetc.data;

import android.content.Context;
import android.content.res.TypedArray;

import com.example.a001_basics_colorsetc.R;
import com.example.a001_basics_colorsetc.Tools;
import com.example.a001_basics_colorsetc.model.Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataGenerator {

    public static List<Books> getBookData(Context ctx) {
        List<Books> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.book_images);
        String name_arr[] = ctx.getResources().getStringArray(R.array.book_names);

        for (int i = 0; i < drw_arr.length(); i++) {
            Books obj = new Books();
            obj.image = drw_arr.getResourceId(i, -1);
            obj.name = name_arr[i];
            obj.email = Tools.getEmailFromName(obj.name);
            obj.imageDrw = ctx.getResources().getDrawable(obj.image);
            items.add(obj);
        }
        Collections.shuffle(items);
        return items;
    }

}
