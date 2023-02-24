package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView apti,code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        apti = (CardView) findViewById(R.id.aptitude);
        code = (CardView) findViewById(R.id.coding);

        apti.setOnClickListener(this);
        code.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.aptitude:
                i= new Intent(this,aptiActivity.class);
                startActivity(i);
                break;

            case R.id.coding:
                i = new Intent(this,codingActivity.class);
                startActivity(i);
                break;
        }
    }
}