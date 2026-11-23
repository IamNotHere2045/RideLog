package ch.ridelog.app
import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
 private lateinit var web: WebView
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
  window.statusBarColor=Color.rgb(217,0,0); window.navigationBarColor=Color.BLACK
  web=WebView(this); web.setBackgroundColor(Color.BLACK); web.settings.javaScriptEnabled=true; web.settings.domStorageEnabled=true
  web.settings.allowFileAccess=false; web.settings.allowContentAccess=false; web.settings.setSupportZoom(false); web.webViewClient=WebViewClient(); setContentView(web); web.loadUrl("file:///android_asset/index.html")
 }
 override fun onBackPressed(){ web.evaluateJavascript("document.querySelectorAll('.overlay').forEach(o=>o.style.display='none')",null) }
}
