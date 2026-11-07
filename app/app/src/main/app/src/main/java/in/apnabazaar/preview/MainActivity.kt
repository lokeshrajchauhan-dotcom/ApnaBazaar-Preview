package in.apnabazaar.preview

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this)

        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
        }

        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        setContentView(webView)

        webView.loadUrl("file:///android_asset/index.html")
    }

    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        val webView = (window.decorView as? android.view.ViewGroup)
            ?.getChildAt(0) as? WebView

        if (webView != null && webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
