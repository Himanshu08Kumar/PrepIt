package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class companyListActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cisco, goldman, tcs, deloitte, wipro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_list);

        cisco = (CardView) findViewById(R.id.cisco);
        goldman = (CardView) findViewById(R.id.goldman);
        tcs = (CardView) findViewById(R.id.tcs);
        deloitte = (CardView) findViewById(R.id.deloitte);
        wipro = (CardView) findViewById(R.id.wipro);

        cisco.setOnClickListener(this);
        goldman.setOnClickListener(this);
        tcs.setOnClickListener(this);
        deloitte.setOnClickListener(this);
        wipro.setOnClickListener(this);

    }
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cisco:
                i = new Intent(this, ciscoActivity.class);
                startActivity(i);
                break;

            case R.id.goldman:
                i = new Intent(this, goldmanActivity.class);
                startActivity(i);
                break;
        }
    }
}