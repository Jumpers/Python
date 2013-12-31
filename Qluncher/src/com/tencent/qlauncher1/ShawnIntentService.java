package com.tencent.qlauncher1;

import android.app.IntentService;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class ShawnIntentService extends IntentService {
	IBinder myBinder =new myBinder();	
	private static final String TAG="ShawnIntentService" ;
	
	
	class myBinder extends Binder{
		
		public ShawnIntentService getShawnIntentService(){
			return ShawnIntentService.this ;
		}
		
		public String sayHello(String name ){
			return "Hi," +name;
		}
	}
	
	public void HelloWorld(){
		for(int i=0;i<15;i++){
			try {
				Thread.sleep(1000) ;
				Log.i(TAG, "Hello world"+i) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public String helloService(){
		return "Call the method helloService." ;
	}
	

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.i(TAG, "onCreate") ;
	}


	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return super.onBind(intent);
	}


	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i(TAG, "onDestroy.") ;
		super.onDestroy();
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
		Log.i(TAG, "onStartCommand.") ;
		return super.onStartCommand(intent, flags, startId);
	}


	@Override
	public void setIntentRedelivery(boolean enabled) {
		// TODO Auto-generated method stub
		super.setIntentRedelivery(enabled);
	}


	public ShawnIntentService() {
		super("hello");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onHandleIntent started.") ;
		for (int i=0;i<50;i++) {
			try {
				Thread.sleep(1000) ;
				Log.i(TAG, "" +i) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
