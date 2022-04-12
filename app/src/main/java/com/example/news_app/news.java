package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class news extends AppCompatActivity {

    private WebView Web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        binding();

        String a = getIntent().getStringExtra("divy");
        Web_view.loadUrl(a);
        Web_view.getSettings().setJavaScriptEnabled(true);
    }

    private void binding(){
        Web_view = findViewById(R.id.Web_view);
    }
}