package com.choudhary.yogeshc;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Instagram extends AppCompatActivity {

    WebView InstaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        setContentView(R.layout.activity_twit);

        InstaView = (WebView) findViewById(R.id.InstaView);
        WebSettings webSettings = InstaView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(InstaView,true);
        InstaView.setWebViewClient(new WebViewClient());
        InstaView.loadUrl("https://www.instagram.com/pillaisalegria");
    }

    @Override
    public void onBackPressed() {
        if(InstaView.canGoBack()){
            InstaView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
