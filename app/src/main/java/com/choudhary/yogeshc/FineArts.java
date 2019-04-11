package com.choudhary.yogeshc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FineArts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine_arts);

    }

    public void reg(View view) {
        Intent intent = new Intent(this,registration_pg.class);
        startActivity(intent);
    }
}
