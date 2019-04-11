package com.choudhary.yogeshc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Informals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informals);

    }

    public void reg(View view) {
        Intent intent = new Intent(this,registration_pg.class);
        startActivity(intent);
    }
}
