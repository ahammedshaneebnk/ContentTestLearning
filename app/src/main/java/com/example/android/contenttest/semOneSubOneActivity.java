package com.example.android.contenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class semOneSubOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_one_sub_one);
        String url = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.webViewId);
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebViewClient(new MyBrowser());
        webView.getSettings().setBuiltInZoomControls(true);

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView x, String y) {
            x.loadUrl(y);
            return true;
        }
    }
}
