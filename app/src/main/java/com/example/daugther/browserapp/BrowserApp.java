package com.example.daugther.browserapp;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static com.example.daugther.browserapp.R.id.button2;

public class BrowserApp extends Activity implements View.OnClickListener{
    private static final String TAG = "Log.d : ";
    private Button mFirstButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_app);
        WebView webView = (WebView) findViewById (R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
        mFirstButton = (Button) findViewById(button2);

        mFirstButton.setOnClickListener(BrowserApp.this);


    }




    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_DPAD_DOWN) {
            Log.e(String.valueOf(keyCode)," key pressed");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "hej");
    }
}
