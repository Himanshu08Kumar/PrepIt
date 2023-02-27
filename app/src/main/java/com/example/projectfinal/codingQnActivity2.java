package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class codingQnActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn2);

        findViewById(R.id.python).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/python-program/find-number-of-integers-which-has-exactly-x-divisors/");
            }
        });

        findViewById(R.id.java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/java-program/finding-number-of-integers-which-has-exactly-x-divisors/");
            }
        });

        findViewById(R.id.cp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/cpp-program/to-find-number-of-integers-which-has-exactly-x-divisors/");
            }
        });

        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/c-program/find-number-of-integers-which-has-exactly-x-divisors/");
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