package com.example.a001_basics_colorsetc.cards;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.a001_basics_colorsetc.R;

public class CardSplashScreen extends AppCompatActivity {


    ViewPager viewPager;
    private static final int MAX_STEP=4;
    private MyViewPagerAdapter myViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_splash_screen);

        viewPager=(ViewPager)findViewById(R.id.view_pager);

        //adding bottom dots
        bottomPogressDots(0);

        myViewPagerAdapter=new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);



    }

    //viewpager change listener

    ViewPager.OnPageChangeListener viewPagerPageChangeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
           bottomPogressDots(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    //function switching from one dot to another
    private void bottomPogressDots(int current_index) {


        LinearLayout dotsLayout=(LinearLayout)findViewById(R.id.layoutDots);
        ImageView[] dots=new ImageView[MAX_STEP];

        dotsLayout.removeAllViews();
        for (int i=0;i<dots.length;i++){
            dots[i]=new ImageView(this);
            int width_height=15;
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_height,width_height));
            params.setMargins(10,10,10,10);
            dots[i].setLayoutParams(params);
            dots[i].setImageResource(R.drawable.shape_circle);
            dots[i].setColorFilter(getResources().getColor(R.color.grey_3), PorterDuff.Mode.SRC_IN);
            dotsLayout.addView(dots[i]);

        }

        if (dots.length>0){
            dots[current_index].setImageResource(R.drawable.shape_circle);
            dots[current_index].setColorFilter(getResources().getColor(R.color.orange_50), PorterDuff.Mode.SRC_IN);
        }
    }

    private String about_title_array[]={

            "Ready to Read",
            "Search A book",
            "Find a Suitable Comfy place",
            "Enjoy Your Book"
    };

    private String about_description_array[]={
       "Lorem Ipsum Lorem Ipsum is simply dummy text of the printing and typesetting industry Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ",
        "or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs",
            "Lorem ipsum is a name for a common type of placeholder text. Also known as filler or dummy text",
            "Lorem ipsum is a pseudo-Latin text used in web design, typography, layout, and printing in place of English to emphasise design elements over content",
    };

    private int about_images_array[]={
            R.drawable.book,
            R.drawable.newbook,
            R.drawable.ic_books,
            R.drawable.books,
    };
    private int bg_images_array[]={
            R.drawable.book,
            R.drawable.newbook,
            R.drawable.ic_books,
            R.drawable.books,
    };

    public class MyViewPagerAdapter extends PagerAdapter{
      private LayoutInflater layoutInflater;
      private Button btnNext;

      public  MyViewPagerAdapter(){

      }

      public Object instantiateItem(ViewGroup container,int position){
          layoutInflater=(LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);


          View view=layoutInflater.inflate(R.layout.item_card_wizard_layout,container,false);
          ((TextView) view.findViewById(R.id.title)).setText(about_title_array[position]);
          ((TextView) view.findViewById(R.id.description)).setText(about_description_array[position]);
          ((ImageView) view.findViewById(R.id.image)).setImageResource(about_images_array[position]);
          ((ImageView) view.findViewById(R.id.image_bg)).setImageResource(bg_images_array[position]);

          btnNext=(Button) view.findViewById(R.id.btn_next);

          if (position==about_title_array.length-1){
              btnNext.setText("Get Started");
          }
          else {
              btnNext.setText("Next");
          }


          btnNext.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  int current=viewPager.getCurrentItem()+1;
                  if (current<MAX_STEP){
                      //move to next screen

                      viewPager.setCurrentItem(current);
                  }else {
                      finish();
                  }
              }
          });


          container.addView(view);
          return view;
      }

        @Override
        public int getCount() {
            return about_title_array.length;
        }

        public boolean isViewFromObject(View view,Object object){
          return  view==object;
        }

        public void destroyItem(ViewGroup container,int position,Object object){
          View view=(View)object;
          container.removeView(view);
        }
    }





}