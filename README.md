# WebView
WebView using HTML UTF-8


### Priview
![ezgif com-resize-2](https://user-images.githubusercontent.com/43386555/58138513-ac3e9d00-7c60-11e9-8c5c-05c94d0fcdb0.gif)

### Source

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
