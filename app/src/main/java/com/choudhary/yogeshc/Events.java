package com.choudhary.yogeshc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ScrollView EscrollView1 = (ScrollView) findViewById(R.id.GscrollView1);
        TableLayout Etable1 = (TableLayout) findViewById(R.id.Etable1);

        TableRow Etablerow1 = (TableRow) findViewById(R.id.Etablerow1);
        TableRow Etablerow2 = (TableRow) findViewById(R.id.Etablerow2);
        TableRow Etablerow3 = (TableRow) findViewById(R.id.Etablerow3);
        TableRow Etablerow5 = (TableRow) findViewById(R.id.Etablerow5);
        TableRow Etablerow7 = (TableRow) findViewById(R.id.Etablerow7);
        TableRow Etablerow8 = (TableRow) findViewById(R.id.Etablerow8);


        TextView EtextView1 = (TextView) findViewById(R.id.EtextView1);
        TextView EtextView2 = (TextView) findViewById(R.id.EtextView2);
        TextView EtextView3 = (TextView) findViewById(R.id.EtextView3);
        TextView EtextView5 = (TextView) findViewById(R.id.EtextView5);
        TextView EtextView7 = (TextView) findViewById(R.id.ETextView7);
        TextView EtextView8 = (TextView) findViewById(R.id.ETextView8);

        Button EButton1 = (Button) findViewById(R.id.EButton1);
        EButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFA = new Intent(getApplicationContext(), FineArts.class);
                startActivity(intentFA);
            }
        });
        Button EButton2 = (Button) findViewById(R.id.EButton2);
        EButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentG = new Intent(getApplicationContext(), GamingEvent.class);
                startActivity(intentG);
            }
        });
        Button EButton3 = (Button) findViewById(R.id.EButton3);
        EButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI = new Intent(getApplicationContext(), Informals.class);
                startActivity(intentI);
            }
        });
        Button EButton5 = (Button) findViewById(R.id.EButton5);
        EButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentM = new Intent(getApplicationContext(), Management.class);
                startActivity(intentM);
            }
        });
        Button EButton7 = (Button) findViewById(R.id.EButton7);
        EButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentS = new Intent(getApplicationContext(), Sports.class);
                startActivity(intentS);
            }
        });
        Button EButton8 = (Button) findViewById(R.id.EButton8);
        EButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTW = new Intent(getApplicationContext(), TechnicalWorkshops.class);
                startActivity(intentTW);
            }
        });
    }
}
