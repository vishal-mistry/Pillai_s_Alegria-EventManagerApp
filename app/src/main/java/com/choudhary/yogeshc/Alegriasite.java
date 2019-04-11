package com.choudhary.yogeshc;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Alegriasite extends AppCompatActivity {

    WebView SiteView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alegriasite);
        SiteView = (WebView) findViewById(R.id.SiteView);
        WebSettings webSettings = SiteView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        SiteView.setWebViewClient(new WebViewClient());
        SiteView.loadUrl("https://alegria.co.in/");
    }

    @Override
    public void onBackPressed() {
        if(SiteView.canGoBack()){
            SiteView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
