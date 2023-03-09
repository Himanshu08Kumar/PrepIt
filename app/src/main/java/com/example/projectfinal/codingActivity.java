package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class codingActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView coding1, coding2, coding3, coding4, coding5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);

        coding1 = (CardView) findViewById(R.id.coding1);
        coding2 = (CardView) findViewById(R.id.coding2);
        coding3 = (CardView) findViewById(R.id.coding3);
        coding4 = (CardView) findViewById(R.id.coding4);
        coding5 = (CardView) findViewById(R.id.coding5);


        coding1.setOnClickListener(this);
        coding2.setOnClickListener(this);
        coding3.setOnClickListener(this);
        coding4.setOnClickListener(this);
        coding5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.coding1:
                i= new Intent(this,codingQnActivity.class);
                startActivity(i);
                break;

            case R.id.coding2:
                i= new Intent(this,codingQnActivity2.class);
                startActivity(i);
                break;

            case R.id.coding3:
                i= new Intent(this,codingQnActivity3.class);
                startActivity(i);
                break;

            case R.id.coding4:
                i=new Intent(this,codingQnActivity4.class);
                startActivity(i);
                break;

            case R.id.coding5:
                i = new Intent(this,codingQnActivity5.class);
                startActivity(i);
                break;
        }
    }
}