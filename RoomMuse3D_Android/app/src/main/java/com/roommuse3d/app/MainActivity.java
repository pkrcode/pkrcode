package com.roommuse3d.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.graphics.Color;
import android.view.View;
public class MainActivity extends Activity {
 private WebView web;
 @Override public void onCreate(Bundle b) {
  super.onCreate(b); getWindow().setStatusBarColor(Color.rgb(23,21,29)); getWindow().setNavigationBarColor(Color.rgb(23,21,29));
  web=new WebView(this); web.setBackgroundColor(Color.rgb(23,21,29)); WebSettings s=web.getSettings();
  s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setMediaPlaybackRequiresUserGesture(false);
  web.setWebChromeClient(new WebChromeClient()); web.setOverScrollMode(View.OVER_SCROLL_NEVER); setContentView(web); web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed(){if(web!=null&&web.canGoBack())web.goBack();else super.onBackPressed();}
}
