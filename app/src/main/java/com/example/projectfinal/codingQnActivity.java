package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class codingQnActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView C,Cp,Java,Python;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn);

        C = (CardView) findViewById(R.id.c);
        Cp = (CardView)findViewById(R.id.cp);
        Java = (CardView)findViewById(R.id.java);
        Python = (CardView)findViewById(R.id.python);

        C.setOnClickListener(this);
        Cp.setOnClickListener(this);
        Java.setOnClickListener(this);
        Python.setOnClickListener(this);

    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.c:
                i = new Intent(this, CAnswerActivity.class);
                startActivity(i);
                break;
            case R.id.java:
                i = new Intent(this, javaAnswerActivity.class);
                startActivity(i);
                break;
            case R.id.cp:
                i = new Intent(this, CpAnswerActivity.class);
                startActivity(i);
                break;

            case R.id.python:
                i = new Intent(this, pythonAnswerActivity.class);
                startActivity(i);
                break;

        }
    }
}