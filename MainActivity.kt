package in.apnabazaar.preview

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = false
            settings.allowContentAccess = false
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
            loadUrl("file:///android_asset/index.html")
        }
        setContentView(webView)
    }

    @Deprecated("Deprecated in Android API")
    override fun onBackPressed() {
        val view = window.decorView.findViewById<WebView>(android.R.id.content)
        if (view != null && view.canGoBack()) view.goBack() else super.onBackPressed()
    }
}
