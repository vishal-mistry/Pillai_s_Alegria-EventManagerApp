package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
    }

    public void reg(View view) {
        Intent intent1 = new Intent(this, social.class);
        startActivity(intent1);
    }

    public void log(View view) {
        Intent intent2 = new Intent(this, login_pg.class);
        startActivity(intent2);
    }

    public void sch(View view) {
        Intent intent3 = new Intent(this, schdm.class);
        startActivity(intent3);
    }

    public void eve(View view) {
        Intent intent4 = new Intent(this,Events.class);
        startActivity(intent4);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
