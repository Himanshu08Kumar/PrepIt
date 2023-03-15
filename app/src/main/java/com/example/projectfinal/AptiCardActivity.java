package com.example.projectfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AptiCardActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView time, trains, SI, profit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti_card);

        time = (CardView) findViewById(R.id.Time);
        trains = (CardView) findViewById(R.id.trains);
        SI = (CardView) findViewById(R.id.SI);
        profit = (CardView) findViewById(R.id.profit);

        time.setOnClickListener(this);
        trains.setOnClickListener(this);
        SI.setOnClickListener(this);
        profit.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.Time:
                i = new Intent(this, aptiActivity.class);
                startActivity(i);
                break;

            case R.id.trains:
                i = new Intent(this, aptiActivity1.class);
                startActivity(i);
                break;
            case R.id.SI:
                i = new Intent(this, aptiActivity2.class);
                startActivity(i);
                break;
            case R.id.profit:
                i = new Intent(this, aptiActivity3.class);
                startActivity(i);
                break;


        }
    }
}