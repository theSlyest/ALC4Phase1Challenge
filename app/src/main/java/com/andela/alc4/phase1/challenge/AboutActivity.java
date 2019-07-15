package com.andela.alc4.phase1.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    private WebView webViewALC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webViewALC = findViewById(R.id.webViewALC);

        webViewALC.setWebViewClient(new MyWebViewClient());
        webViewALC.getSettings().setJavaScriptEnabled(true);

        webViewALC.loadUrl(getString(R.string.alc_url));
    }

    private class MyWebViewClient extends WebViewClient {

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
            //super.onReceivedSslError(view, handler, er);

            handler.proceed(); // Ignore SSL certificate errors
        }

    }
}
