package com.redudant.webviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true); //kebanyakan website menggunakan javascript maka harus di aktifkan

        webView.setWebViewClient(new WebViewClient()); //jika setWebViewClient tidak di aktifkan maka setiap halaman akan mendirect ke web bukan tampil di HP

        //webView.loadUrl("https://google.com");

        webView.loadData(
                "<html> <body> <h1> Hei there </h1> <p>This is webview </p> <form><form>" +
                        "<form action=\"/action_page.php\">\n" +
                        "  <fieldset>\n" +
                        "    <legend>Personal information:</legend>\n" +
                        "    First name:<br>\n" +
                        "    <input type=\"text\" name=\"firstname\" value=\"Captain\"><br>\n" +
                        "    Last name:<br>\n" +
                        "    <input type=\"text\" name=\"lastname\" value=\"Redudant\"><br><br>\n" +
                        "    <input type=\"submit\" value=\"Submit\">\n" +
                        "  </fieldset>\n" +
                        "</form>" +
                        "</form> </body> </html>", "text/html" , "UTF-8"

        );


    }
}
