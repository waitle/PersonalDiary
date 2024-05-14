package com.softengnier.personaldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class WebSearch_View extends AppCompatActivity {

    ImageButton rtnHomeBtn;
    WebView webView;
    EditText urlInput;
    Button searchBtn;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_search);

        rtnHomeBtn = findViewById(R.id.btn_rtnHome_web);
        rtnHomeBtn.setOnClickListener(v -> {
            finish();
        });
        searchBtn = findViewById(R.id.btn_enter_web);
        urlInput = findViewById(R.id.edit_url);
        webView = findViewById(R.id.webView_browser);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("http://www.google.com");
        urlInput.setText("http://www.google.com");

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = urlInput.getText().toString();
                if(!address.startsWith("http://")){ //editText 입력된 브라우저의 주소에 "http://" 없으면 붙쳐준다.
                    address = "http://" +address;
                }
                Toast.makeText(WebSearch_View.this, "Loading...", Toast.LENGTH_SHORT).show();

                webView.loadUrl(urlInput.getText().toString());
            }
        });

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        });

    }
}