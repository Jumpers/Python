package com.tencent.qlauncher1;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

public class ShawnApplication extends Application {
	
	public final String TAG="ShawnApplicaton";
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		Log.d(TAG, "Shawn.xiao Config changed.");
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.d(TAG, "Shawn.xiao onCreated");
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
		Log.d(TAG, "Shawn.xiao onLowMemory.");
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
		Log.d(TAG, "Shawn.xiao onTerminate.");
	}
	
}
