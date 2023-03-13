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
    public CardView time, trains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti_card);

        time = (CardView) findViewById(R.id.Time);
        trains = (CardView) findViewById(R.id.trains);

        time.setOnClickListener(this);
        trains.setOnClickListener(this);
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


        }
    }
}