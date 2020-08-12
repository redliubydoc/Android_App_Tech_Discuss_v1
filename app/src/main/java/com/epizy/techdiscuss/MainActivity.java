package com.epizy.techdiscuss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* tracking web view wiget */

        webView = (WebView) findViewById(R.id.webView);

        /* creating object of web viwe settings */

        WebSettings webSettings =  webView.getSettings();

        /* enabling javascript in web view */

        webSettings.setJavaScriptEnabled(true);

        /* loafing tech discuss url */

        webView.loadUrl("http://www.techdiscuss.epizy.com");

        /* to make the app itself as a web browser */

        webView.setWebViewClient(new WebViewClient());
    }

    /* to make android back button act as web browser back button */

    @Override
    public void onBackPressed()
    {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
