package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class codingQnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn);
        findViewById(R.id.python).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/python-program/to-find-prime-numbers-between-1-too-100/");
            }
        });

        findViewById(R.id.java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/java-program/find-prime-number-between-1-to-100/");
            }
        });

        findViewById(R.id.cp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/cpp-program/prime-number-between-1-to-100/");
            }
        });

        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/c-program/prime-number-between-1-to-100/");
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