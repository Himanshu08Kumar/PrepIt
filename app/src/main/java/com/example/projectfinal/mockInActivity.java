package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mockInActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView test1, test2, test3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_in);

        test1 = (CardView) findViewById(R.id.test1);
        test2 = (CardView) findViewById(R.id.test2);
        test3 = (CardView) findViewById(R.id.test3);

        test1.setOnClickListener(this);
        test2.setOnClickListener(this);
        test3.setOnClickListener(this);

    }
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.test1:
                i= new Intent(this, mockActivity1.class);
                startActivity(i);
                break;
            case R.id.test2:
                i= new Intent(this, mockActivity2.class);
                startActivity(i);
                break;
            case R.id.test3:
                i= new Intent(this, mockActivity3.class);
                startActivity(i);
                break;

        }
    }
}