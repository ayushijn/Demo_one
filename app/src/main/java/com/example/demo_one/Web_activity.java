package com.example.demo_one;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_xml);
        final WebView webview=(WebView)findViewById(R.id.webview);
        webview.loadUrl("http://www.javatpoint.com/");
    }
}
