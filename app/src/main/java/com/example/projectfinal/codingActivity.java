package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class codingActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView coding1, coding2, coding3, coding4, coding5, coding6, coding7, coding8, coding9, coding10, coding11, coding12, coding13, coding14, coding15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);

        coding1 = (CardView) findViewById(R.id.coding1);
        coding2 = (CardView) findViewById(R.id.coding2);
        coding3 = (CardView) findViewById(R.id.coding3);
        coding4 = (CardView) findViewById(R.id.coding4);
        coding5 = (CardView) findViewById(R.id.coding5);
        coding6 = (CardView) findViewById(R.id.coding6);
        coding7 = (CardView) findViewById(R.id.coding7);
        coding8 = (CardView) findViewById(R.id.coding8);
        coding9 = (CardView) findViewById(R.id.coding9);
        coding10 = (CardView) findViewById(R.id.coding10);
        coding11 = (CardView) findViewById(R.id.coding11);
        coding12 = (CardView) findViewById(R.id.coding12);
        coding13 = (CardView) findViewById(R.id.coding13);
        coding14 = (CardView) findViewById(R.id.coding14);
        coding15 = (CardView) findViewById(R.id.coding15);



        coding1.setOnClickListener(this);
        coding2.setOnClickListener(this);
        coding3.setOnClickListener(this);
        coding4.setOnClickListener(this);
        coding5.setOnClickListener(this);
        coding6.setOnClickListener(this);
        coding7.setOnClickListener(this);
        coding8.setOnClickListener(this);
        coding9.setOnClickListener(this);
        coding10.setOnClickListener(this);
        coding11.setOnClickListener(this);
        coding12.setOnClickListener(this);
        coding13.setOnClickListener(this);
        coding14.setOnClickListener(this);
        coding15.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.coding1:
            case R.id.coding2:
            case R.id.coding3:
            case R.id.coding4:
            case R.id.coding5:
            case R.id.coding6:
            case R.id.coding7:
            case R.id.coding8:
            case R.id.coding9:
            case R.id.coding10:
            case R.id.coding11:
            case R.id.coding12:
            case R.id.coding13:
            case R.id.coding14:
            case R.id.coding15:
                i= new Intent(this,codingQnActivity.class);
                startActivity(i);
                break;
        }
    }
}