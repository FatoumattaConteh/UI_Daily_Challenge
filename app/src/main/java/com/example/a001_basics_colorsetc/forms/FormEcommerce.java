package com.example.a001_basics_colorsetc.forms;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.a001_basics_colorsetc.R;
import com.example.a001_basics_colorsetc.Tools;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;

public class FormEcommerce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ecommerce);

        initToolbar();
        initComponents();
    }

    private void initComponents() {
        (findViewById(R.id.bt_exp_date)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogDatePickerLight(v);
            }
        });

    }


    private void dialogDatePickerLight(final View v){
        Calendar cur_calender=Calendar.getInstance();
        DatePickerDialog datePicker=DatePickerDialog.newInstance(
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                     Calendar calendar=Calendar.getInstance();
                     calendar.set(Calendar.YEAR,year);
                     calendar.set(Calendar.MONTH,monthOfYear);
                     calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                     long date=calendar.getTimeInMillis();
                        ((EditText) v).setText(Tools.getFoormattedDateShort(date));
                    }
                },
                cur_calender.get(Calendar.YEAR),
                cur_calender.get(Calendar.MONTH),
                cur_calender.get(Calendar.DAY_OF_MONTH)

                );

        datePicker.setThemeDark(false);
        datePicker.setAccentColor(getResources().getColor(R.color.colorPrimary));
        datePicker.setMinDate(cur_calender);
        datePicker.show(getSupportFragmentManager(),"Expiration Date");
    }


    private void initToolbar() {
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Form Ecommerce");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Tools.setSystemBarColor(this);
    }

}