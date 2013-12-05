package com.androidbook.myfirstandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.media.MediaPlayer;
import android.net.Uri;
import android.location.Location;
import android.location.LocationManager;


public class MyFirstAndroidAppActivity extends Activity {
	
	private static final String DEBUG_TAG= "MyFirstAppLogging";
	private MediaPlayer mp;
	private int i;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.i(DEBUG_TAG, "Info about MyFirstAndroidApp");
        
        // getLocation(); 
        
        // playMusicFromWeb();
        
         forceError();
    }
    public void forceError() {
        if(true) {
        	Log.e(DEBUG_TAG, "我觉得log应该打印在这里");
            throw new Error("Whoops");
        }
    }
    
    public void playMusicFromWeb() {
        try {
            Uri file = Uri.parse("http://www.perlgurl.org/podcast/archives/podcasts/PerlgurlPromo.mp3");
            mp = MediaPlayer.create(this, file);
            mp.start();
        }
        catch (Exception e) {
            Log.e(DEBUG_TAG, "Player failed", e);
        }
    }
    
    public void getLocation() {
        try {
            LocationManager locMgr = (LocationManager)
                getSystemService(LOCATION_SERVICE);
            Location recentLoc = locMgr.
                getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Log.i(DEBUG_TAG, "loc: " + recentLoc.toString());
        }
        catch (Exception e) {
            Log.e(DEBUG_TAG, "Location failed", e);
        }
    }

    
    protected void onStop() {
        if (mp != null) {
            mp.stop();
            mp.release();
        }
        super.onStop();
    }



}