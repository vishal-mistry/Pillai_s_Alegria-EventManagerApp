package com.choudhary.yogeshc;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Youtube extends AppCompatActivity {

    WebView YoutubeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        YoutubeView = (WebView) findViewById(R.id.YoutubeView);
        WebSettings webSettings = YoutubeView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        YoutubeView.setWebViewClient(new WebViewClient());
        YoutubeView.loadUrl("https://www.youtube.com/channel/UCfqP3NEaaXPsgHn8QX3qilw");
    }

    @Override
    public void onBackPressed() {
        if(YoutubeView.canGoBack()){
            YoutubeView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
