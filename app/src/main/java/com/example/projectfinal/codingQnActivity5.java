package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class codingQnActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_qn5);

        findViewById(R.id.python).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/python-program/finding-the-frequency-of-elements-in-an-array-using-python/");
            }
        });

        findViewById(R.id.java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/java-program/to-find-the-frequency-of-elements-in-an-array/");
            }
        });

        findViewById(R.id.cp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/cpp-program/to-find-the-frequency-of-elements-in-an-array/");
            }
        });

        findViewById(R.id.c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://prepinsta.com/c-program/to-find-the-frequency-of-each-element-in-the-array/");
            }
        });
    }
    public void clicked_btn(String uri)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);    }
}