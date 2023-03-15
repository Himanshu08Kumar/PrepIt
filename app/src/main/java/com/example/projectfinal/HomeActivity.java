package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView apti,code,interview,mock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        apti = (CardView) findViewById(R.id.aptitude);
        code = (CardView) findViewById(R.id.coding);
        interview = (CardView) findViewById(R.id.interview);
        mock = (CardView)findViewById(R.id.mock);

        apti.setOnClickListener(this);
        code.setOnClickListener(this);
        interview.setOnClickListener(this);
        mock.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.aptitude:
                i= new Intent(this,AptiCardActivity.class);
                startActivity(i);
                break;

            case R.id.coding:
                i = new Intent(this,codingActivity.class);
                startActivity(i);
                break;

            case R.id.interview:
                i= new Intent(this,companyListActivity.class);
                startActivity(i);
                break;

            case R.id.mock:
                i = new Intent(this,mockInActivity.class);
                startActivity(i);
                break;
        }
    }
}