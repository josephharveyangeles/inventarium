package com.creosoft.inventarium;

import org.creosoft.hecate.utils.windowUtils.ScreenUtils;
import org.creosoft.hecate.utils.windowUtils.SplashMonth;
import org.creosoft.hecate.utils.windowUtils.SplashSequence;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashAppDetails;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashClassGroup;
import org.creosoft.hecate.utils.windowUtils.SplashSequence.SplashTimeDetails;

import android.app.Activity;
import android.os.Bundle;

public class InventariumLauncherView extends Activity {

	private final static String APPNAME = "inventarium";
	private final static int SPLASHTIME = 3500;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ScreenUtils.forceFullScreen(this, R.layout.activity_launcher_view);
		
		SplashTimeDetails splashTime = new SplashTimeDetails(SPLASHTIME, SplashMonth.APR.ordinal(), 1, 2015);
		SplashAppDetails splashApp = new SplashAppDetails(APPNAME, this);
		SplashClassGroup splashGroup = new SplashClassGroup(InventariumLimboView.class, InventariumMainFormView.class);
		
		SplashSequence splash = new SplashSequence.Builder(splashTime, splashApp, splashGroup).build();
		
		splash.startSequence();
	}
}
