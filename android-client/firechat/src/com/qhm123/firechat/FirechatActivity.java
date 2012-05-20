package com.qhm123.firechat;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

import com.strumsoft.websocket.phonegap.WebSocketFactory;

public class FirechatActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");

		// attach websocket factory
		appView.addJavascriptInterface(new WebSocketFactory(appView),
				"WebSocketFactory");
	}
}