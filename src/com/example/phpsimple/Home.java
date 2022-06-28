package com.example.phpsimple;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Home extends Activity {

	private WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		webView=(WebView)findViewById(R.id.web);
		webView.setWebViewClient(new WebViewClient());
		webView.loadUrl("http://phpissimple.blogspot.com/");
		
		WebSettings webSettings=webView.getSettings();
		webSettings.setJavaScriptEnabled(true);                              
	}

		
	@Override
	public void onBackPressed(){
		if(webView.canGoBack()){
			webView.goBack();
		}else{
			super.onBackPressed();
		}
	}
	
}
