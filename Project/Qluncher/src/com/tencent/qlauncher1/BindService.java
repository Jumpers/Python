package com.tencent.qlauncher1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class BindService extends Service {
	IBinder mMyBinder =new mMyBinder();
	public static final String TAG="BindService" ;
	
	class  mMyBinder extends Binder{
		public String helloWorld(String name ){
			return "your name is "+name ;
		}
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i(TAG, "onBind") ;
		return mMyBinder;
	}

}
