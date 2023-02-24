package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class codingActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView coding1, coding2, coding3, coding4, coding5, coding6, coding7, coding8,coding9,coding10;

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
                i= new Intent(this,codingQnActivity.class);
                startActivity(i);
                break;



        }
    }
}