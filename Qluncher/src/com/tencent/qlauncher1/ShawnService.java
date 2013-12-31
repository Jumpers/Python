package com.tencent.qlauncher1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class ShawnService extends Service {
	private MediaPlayer mMusicPlayer;
	private static final String TAG="ShawnService" ;
	IBinder xMyBinder =new xMyBinder() ;
	class xMyBinder extends Binder{
		public void SayHello(String name){
			for(int i=0;i<15;i++){
				try {
					Thread.sleep(1000);
					Log.i(TAG, "Hello "+name +"  the "+i +"times") ;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onBind.") ;
		return xMyBinder;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		mMusicPlayer=MediaPlayer.create(this, R.raw.twentyyaers) ;
		super.onCreate();
		Log.i(TAG, "onCreate.") ;
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "onDestroy.") ;
	}

	@Override
	public void onRebind(Intent intent) {
		// TODO Auto-generated method stub
		super.onRebind(intent);
		Log.i(TAG, "onRebind.") ;
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		Log.i(TAG, "onStart.") ;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		/*new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Log.i(TAG, "onStartCommand.") ;
				helloShawn();
			}
		}).start() ;*/
		if(intent !=null){
			int _command;
			_command =intent.getExtras().getInt("musicCommand") ;
			switch (_command) {
			case 1:
				mMusicPlayer.start();
				break;
			case 2:
				mMusicPlayer.pause();
				break;
			case 3:
				mMusicPlayer.stop();
				mMusicPlayer.release();
				mMusicPlayer=null;
				break;
			default:
				break;
			}
		}
		
		return super.onStartCommand(intent, flags, startId);
		
	}

	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onUnbind") ;
		return super.onUnbind(intent);
	}
	
	

}
