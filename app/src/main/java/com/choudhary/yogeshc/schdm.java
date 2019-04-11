package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class schdm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schdm);
    }

    public void day1(View view) {
        Intent intent1 = new Intent(this, day1.class);
        startActivity(intent1);
    }

    public void day2(View view) {
        Intent intent2 = new Intent(this, day2.class);
        startActivity(intent2);
    }

    public void day3(View view) {
        Intent intent3 = new Intent(this, day3.class);
        startActivity(intent3);
    }

    public void day4(View view) {
        Intent intent4 = new Intent(this, day4.class);
        startActivity(intent4);
    }

    public void day5(View view) {
        Intent intent5 = new Intent(this, day5.class);
        startActivity(intent5);
    }
}
