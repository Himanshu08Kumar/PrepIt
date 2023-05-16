package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class jobActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        listView = findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    } // OnCreate Method Close Here =============

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.expandable_item, parent,false);

            LinearLayout motherLayout = myView.findViewById(R.id.motherLayout);


            RelativeLayout itemClicked = myView.findViewById(R.id.itemClicked);
            RelativeLayout itemClicked1 = myView.findViewById(R.id.itemClicked1);
            RelativeLayout itemClicked2 = myView.findViewById(R.id.itemClicked2);
            RelativeLayout itemClicked3 = myView.findViewById(R.id.itemClicked3);
            RelativeLayout itemClicked4 = myView.findViewById(R.id.itemClicked4);
            RelativeLayout itemClicked5 = myView.findViewById(R.id.itemClicked5);
            RelativeLayout itemClicked6 = myView.findViewById(R.id.itemClicked6);
            RelativeLayout itemClicked7 = myView.findViewById(R.id.itemClicked7);
            RelativeLayout itemClicked8 = myView.findViewById(R.id.itemClicked8);


            ImageView arrowImg = myView.findViewById(R.id.arrowImg);
            ImageView arrowImg1 = myView.findViewById(R.id.arrowImg1);
            ImageView arrowImg2 = myView.findViewById(R.id.arrowImg2);
            ImageView arrowImg3 = myView.findViewById(R.id.arrowImg3);
            ImageView arrowImg4 = myView.findViewById(R.id.arrowImg4);
            ImageView arrowImg5 = myView.findViewById(R.id.arrowImg5);
            ImageView arrowImg6 = myView.findViewById(R.id.arrowImg6);
            ImageView arrowImg7 = myView.findViewById(R.id.arrowImg7);
            ImageView arrowImg8 = myView.findViewById(R.id.arrowImg8);



            LinearLayout discLayout = myView.findViewById(R.id.discLayout);
            LinearLayout discLayout1 = myView.findViewById(R.id.discLayout1);
            LinearLayout discLayout2 = myView.findViewById(R.id.discLayout2);
            LinearLayout discLayout3 = myView.findViewById(R.id.discLayout3);
            LinearLayout discLayout4 = myView.findViewById(R.id.discLayout4);
            LinearLayout discLayout5 = myView.findViewById(R.id.discLayout5);
            LinearLayout discLayout6 = myView.findViewById(R.id.discLayout6);
            LinearLayout discLayout7 = myView.findViewById(R.id.discLayout7);
            LinearLayout discLayout8 = myView.findViewById(R.id.discLayout8);




            itemClicked.setOnClickListener(v -> {
                // code here ===
                if (discLayout.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }

            });

            itemClicked1.setOnClickListener(v ->{
                if (discLayout1.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout1.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg1.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout1.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg1.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked2.setOnClickListener(v ->{
                if (discLayout2.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout2.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg2.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout2.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg2.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked3.setOnClickListener(v ->{
                if (discLayout3.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout3.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg3.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout3.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg3.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked4.setOnClickListener(v ->{
                if (discLayout4.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout4.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg4.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout4.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg4.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked5.setOnClickListener(v ->{
                if (discLayout5.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout5.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg5.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout5.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg5.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });


            itemClicked6.setOnClickListener(v ->{
                if (discLayout6.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout6.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg6.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout6.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg6.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked7.setOnClickListener(v ->{
                if (discLayout7.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout7.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg7.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout7.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg7.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            itemClicked8.setOnClickListener(v ->{
                if (discLayout8.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout8.setVisibility(View.VISIBLE);
                    motherLayout.setBackgroundColor(Color.parseColor("#724CAF50"));
                    arrowImg8.setImageResource(R.drawable.baseline_keyboard_arrow_up_24);
                } else {
                    TransitionManager.beginDelayedTransition(motherLayout, new AutoTransition());
                    discLayout8.setVisibility(View.GONE);
                    motherLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    arrowImg8.setImageResource(R.drawable.baseline_arrow_drop_down_24);
                }
            });

            return myView;
        }
    }
}