package com.choudhary.yogeshc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class social extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        Button twitterBtn = (Button) findViewById(R.id.twitterBtn);
        Button instaBtn = (Button) findViewById(R.id.instaBtn);
        Button youtubeBtn = (Button) findViewById(R.id.youtubeBtn);
        Button facebookBtn = (Button) findViewById(R.id.facebookBtn);
        Button siteBtn = (Button) findViewById(R.id.siteBtn);

        twitterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twt_intent = new Intent(getApplicationContext(),Twitter.class);
                startActivity(twt_intent);
            }
        });

        instaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insta_intent = new Intent(getApplicationContext(),Instagram.class);
                startActivity(insta_intent);
            }
        });

        youtubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yt_intent = new Intent(getApplicationContext(),Youtube.class);
                startActivity(yt_intent);
            }
        });

        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb_intent = new Intent(getApplicationContext(),Facebook.class);
                startActivity(fb_intent);
            }
        });

        siteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent site_intent = new Intent(getApplicationContext(),Alegriasite.class);
                startActivity(site_intent);
            }
        });
    }
}
