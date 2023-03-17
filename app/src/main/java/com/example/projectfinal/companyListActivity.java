package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class companyListActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView cisco, tcsNinja, tcs, deloitte, wipro, accenture, infosys, cognizant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_list);

        cisco = (CardView) findViewById(R.id.cisco);
        tcsNinja = (CardView) findViewById(R.id.tcsNinja);
        tcs = (CardView) findViewById(R.id.tcs);
        deloitte = (CardView) findViewById(R.id.deloitte);
        wipro = (CardView) findViewById(R.id.wipro);
        accenture = (CardView) findViewById(R.id.accenture);
        infosys = (CardView) findViewById(R.id.infosys);
        cognizant = (CardView)findViewById(R.id.cognizant);

        cisco.setOnClickListener(this);
        tcsNinja.setOnClickListener(this);
        tcs.setOnClickListener(this);
        deloitte.setOnClickListener(this);
        wipro.setOnClickListener(this);
        accenture.setOnClickListener(this);
        infosys.setOnClickListener(this);
        cognizant.setOnClickListener(this);


    }
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cisco:
                i = new Intent(this, ciscoActivity.class);
                startActivity(i);
                break;

            case R.id.tcsNinja:
                i = new Intent(this, tcsNinjaActivity.class);
                startActivity(i);
                break;

            case R.id.tcs:
                i = new Intent(this, tcsActivity.class);
                startActivity(i);
                break;

            case R.id.deloitte:
                i = new Intent(this, deloitteActivity.class);
                startActivity(i);
                break;

            case R.id.wipro:
                i = new Intent(this, wiproActivity.class);
                startActivity(i);
                break;

            case R.id.accenture:
                i = new Intent(this, accentureActivity.class);
                startActivity(i);
                break;

            case R.id.infosys:
                i = new Intent(this, infosysActivity.class);
                startActivity(i);
                break;

            case R.id.cognizant:
                i = new Intent(this, cognizantActivity.class);
                startActivity(i);
                break;
        }
    }
}