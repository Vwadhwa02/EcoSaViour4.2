package com.vips.ecosaviour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = (WebView) findViewById(R.id.wb);
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf--lA0ENQs6OuF1rsnwfInhG4aYlU7n0Q4yIsSdruXuuzwfA/viewform?usp=sf_link");
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }


    }
}