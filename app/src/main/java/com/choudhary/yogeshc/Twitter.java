package com.choudhary.yogeshc;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Twitter extends AppCompatActivity {

    WebView TwitterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twit);


        TwitterView = (WebView)findViewById(R.id.TwitterView);
        WebSettings webSettings = TwitterView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        TwitterView.setWebViewClient(new WebViewClient());
        TwitterView.loadUrl("https://twitter.com/PillaisAlegria");
    }

    @Override
    public void onBackPressed() {
        if(TwitterView.canGoBack()){
            TwitterView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
