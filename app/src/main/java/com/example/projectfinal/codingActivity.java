package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class codingActivity extends AppCompatActivity implements View.OnClickListener{
    public CardView coding1, coding2, coding3, coding4, coding5, coding6, coding7, coding8, coding9, coding10, coding11, coding12, coding13, coding14, coding15, coding16, coding17, coding18, coding19, coding20, coding21, coding22, coding23, coding24, coding25, coding26, coding27, coding28, coding29, coding30, coding31, coding32, coding33, coding34, coding35, coding36, coding37, coding38, coding39, coding40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding);

        coding1 = (CardView) findViewById(R.id.coding1);
        coding2 = (CardView) findViewById(R.id.coding2);
        coding3 = (CardView) findViewById(R.id.coding3);
        coding4 = (CardView) findViewById(R.id.coding4);
        coding5 = (CardView) findViewById(R.id.coding5);
        coding6 = (CardView) findViewById(R.id.coding6);
        coding7 = (CardView) findViewById(R.id.coding7);
        coding8 = (CardView) findViewById(R.id.coding8);
        coding9 = (CardView) findViewById(R.id.coding9);
        coding10 = (CardView) findViewById(R.id.coding10);
        coding11 = (CardView) findViewById(R.id.coding11);
        coding12 = (CardView) findViewById(R.id.coding12);
        coding13 = (CardView) findViewById(R.id.coding13);
        coding14 = (CardView) findViewById(R.id.coding14);
        coding15 = (CardView) findViewById(R.id.coding15);
        coding16 = (CardView) findViewById(R.id.coding16);
        coding17 = (CardView) findViewById(R.id.coding17);
        coding18 = (CardView) findViewById(R.id.coding18);
        coding19 = (CardView) findViewById(R.id.coding19);
        coding20 = (CardView) findViewById(R.id.coding20);
        coding21 = (CardView) findViewById(R.id.coding21);
        coding22 = (CardView) findViewById(R.id.coding22);
        coding23 = (CardView) findViewById(R.id.coding23);
        coding24 = (CardView) findViewById(R.id.coding24);
        coding25 = (CardView) findViewById(R.id.coding25);
        coding26 = (CardView) findViewById(R.id.coding26);
        coding27 = (CardView) findViewById(R.id.coding27);
        coding28 = (CardView) findViewById(R.id.coding28);
        coding29 = (CardView) findViewById(R.id.coding29);
        coding30 = (CardView) findViewById(R.id.coding30);
        coding31 = (CardView) findViewById(R.id.coding31);
        coding32 = (CardView) findViewById(R.id.coding32);
        coding33 = (CardView) findViewById(R.id.coding33);
        coding34 = (CardView) findViewById(R.id.coding34);
        coding35 = (CardView) findViewById(R.id.coding35);
        coding36 = (CardView) findViewById(R.id.coding36);
        coding37 = (CardView) findViewById(R.id.coding37);
        coding38 = (CardView) findViewById(R.id.coding38);
        coding39 = (CardView) findViewById(R.id.coding39);
        coding40 = (CardView) findViewById(R.id.coding40);

        coding1.setOnClickListener(this);
        coding2.setOnClickListener(this);
        coding3.setOnClickListener(this);
        coding4.setOnClickListener(this);
        coding5.setOnClickListener(this);
        coding6.setOnClickListener(this);
        coding7.setOnClickListener(this);
        coding8.setOnClickListener(this);
        coding9.setOnClickListener(this);
        coding10.setOnClickListener(this);
        coding11.setOnClickListener(this);
        coding12.setOnClickListener(this);
        coding13.setOnClickListener(this);
        coding14.setOnClickListener(this);
        coding15.setOnClickListener(this);
        coding16.setOnClickListener(this);
        coding17.setOnClickListener(this);
        coding18.setOnClickListener(this);
        coding19.setOnClickListener(this);
        coding20.setOnClickListener(this);
        coding21.setOnClickListener(this);
        coding22.setOnClickListener(this);
        coding23.setOnClickListener(this);
        coding24.setOnClickListener(this);
        coding25.setOnClickListener(this);
        coding26.setOnClickListener(this);
        coding27.setOnClickListener(this);
        coding28.setOnClickListener(this);
        coding29.setOnClickListener(this);
        coding30.setOnClickListener(this);
        coding31.setOnClickListener(this);
        coding32.setOnClickListener(this);
        coding33.setOnClickListener(this);
        coding34.setOnClickListener(this);
        coding35.setOnClickListener(this);
        coding36.setOnClickListener(this);
        coding37.setOnClickListener(this);
        coding38.setOnClickListener(this);
        coding39.setOnClickListener(this);
        coding40.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.coding1:
            case R.id.coding2:
            case R.id.coding3:
            case R.id.coding4:
            case R.id.coding5:
            case R.id.coding6:
            case R.id.coding7:
            case R.id.coding8:
            case R.id.coding9:
            case R.id.coding10:
            case R.id.coding11:
            case R.id.coding12:
            case R.id.coding13:
            case R.id.coding14:
            case R.id.coding15:
            case R.id.coding16:
            case R.id.coding17:
            case R.id.coding18:
            case R.id.coding19:
            case R.id.coding20:
            case R.id.coding21:
            case R.id.coding22:
            case R.id.coding23:
            case R.id.coding24:
            case R.id.coding25:
            case R.id.coding26:
            case R.id.coding27:
            case R.id.coding28:
            case R.id.coding29:
            case R.id.coding30:
            case R.id.coding31:
            case R.id.coding32:
            case R.id.coding33:
            case R.id.coding34:
            case R.id.coding35:
            case R.id.coding36:
            case R.id.coding37:
            case R.id.coding38:
            case R.id.coding39:
            case R.id.coding40:
                i= new Intent(this,codingQnActivity.class);
                startActivity(i);
                break;
        }
    }
}