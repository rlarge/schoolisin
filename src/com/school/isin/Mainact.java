package com.school.isin;
import org.apache.cordova.*;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


	public class Mainact extends DroidGap {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			super.loadUrl("file:///android_asset/www/index.html", 10000);

		}
		
	}
