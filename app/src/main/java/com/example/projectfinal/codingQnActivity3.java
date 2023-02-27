package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class codingQnActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn3);

        findViewById(R.id.python).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/python-program/program-to-sort-first-half-in-ascending-order-and-second-half-in-descending-order-in-an-array/");
            }
        });

        findViewById(R.id.java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/java-program/for-sorting-first-half-in-ascending-order-and-second-half-in-descending/");
            }
        });

        findViewById(R.id.cp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/cpp-program/program-to-sort-an-array-in-ascending-and-descending-order/");
            }
        });

        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/c-program/sort-first-half-in-ascending-order-and-second-descending-order/");
            }
        });
    }
    public void clicked_btn(String uri)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }
}