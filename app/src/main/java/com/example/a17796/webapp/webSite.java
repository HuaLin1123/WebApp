package com.example.a17796.webapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_site);
        // sets up and opens web page
        WebView webPage=(WebView) findViewById(R.id.webview);
        // needed to enable javascript
        WebSettings webSetting=webPage.getSettings();
        webSetting.setJavaScriptEnabled(true);
        // stays on webview when link is clicked
        webPage.setWebViewClient(new WebViewClient());
        // sets website to display
        webPage.loadUrl("http://www.myonlinegrades.com");
    }
}
