package com.choudhary.yogeshc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class database extends AppCompatActivity {

    WebView SheetsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        SheetsView = (WebView)findViewById(R.id.SheetsView);
        WebSettings webSettings = SheetsView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        SheetsView.setWebViewClient(new WebViewClient());
        SheetsView.loadUrl("https://docs.google.com/spreadsheets/d/1sAsjj8lwqIqev9sEzad5KEdcNPZyfjkZ24s-6tIabn8/edit?usp=sharing");
    }

    @Override
    public void onBackPressed() {
        if(SheetsView.canGoBack()){
            SheetsView.goBack();
        }else{
            super.onBackPressed();}
    }


}
