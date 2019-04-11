package com.choudhary.yogeshc;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Facebook extends AppCompatActivity {

    WebView FacebookView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        FacebookView = (WebView) findViewById(R.id.FacebookView);
        WebSettings webSettings = FacebookView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        FacebookView.setWebViewClient(new WebViewClient());
        FacebookView.loadUrl("https://www.facebook.com/pillaisalegria/");
    }

    @Override
    public void onBackPressed() {
        if(FacebookView.canGoBack()){
            FacebookView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
