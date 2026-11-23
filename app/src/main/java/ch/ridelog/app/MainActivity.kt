package ch.ridelog.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient

class MainActivity : Activity() {
    private lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(217, 0, 0)
        window.navigationBarColor = Color.BLACK

        web = WebView(this)
        web.setBackgroundColor(Color.BLACK)

        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true

        // Android assets are loaded through file:///android_asset/.
        // File access must be enabled for this local packaged content.
        web.settings.allowFileAccess = true
        web.settings.allowContentAccess = false

        // Keep file-origin access restricted to avoid exposing other local files.
        web.settings.allowFileAccessFromFileURLs = false
        web.settings.allowUniversalAccessFromFileURLs = false
        web.settings.setSupportZoom(false)

        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()

        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }

    @Deprecated("Deprecated in Android API")
    override fun onBackPressed() {
        web.evaluateJavascript(
            "document.querySelectorAll('.overlay').forEach(o => o.style.display = 'none')",
            null
        )
    }
}
