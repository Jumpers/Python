package com.tencent.qlauncher1;

import com.tencent.qlauncher1.ShawnService.xMyBinder;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText mEditText;
	private final String TAG = "MainActivity";
	private Intent mIntent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate.");
		setContentView(R.layout.activity_main);

		Button button1 = (Button) findViewById(R.id.button1);
		button1.setText("Start ShawnService.");
		mEditText = (EditText) findViewById(R.id.editText1);

		if (savedInstanceState != null) {
			mEditText.setText(savedInstanceState.getString(
					"com.tencent.qlauncher1.SAVEINSTANCE").toString());
			Log.i(TAG, "onRestroeInstance is called.");
		}

		// add stopServiceButton
		final Button stopServiceButton = new Button(this);
		stopServiceButton.setText("Stop ShawnService.");
		// add startIntentServiceButton
		Button startIntentServiceButton = new Button(this);
		startIntentServiceButton.setText("StartIntentService");

		// add bindServiceButton
		Button bindServiceButton = new Button(this);
		bindServiceButton.setText("bindServiceButton");
		
		//add unbindServiceButton
		Button unbindServiceButton = new Button(this);
		unbindServiceButton.setText("unbindServiceButton");
		
		//找到对应的布局id
		LinearLayout _ll = (LinearLayout) findViewById(R.id._MainActivity);
		//添加对应和按扭
		_ll.addView(stopServiceButton);
		_ll.addView(startIntentServiceButton);
		_ll.addView(bindServiceButton);
		_ll.addView(unbindServiceButton);

		stopServiceButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.i(TAG, "click stopService");
				if (mIntent != null) {
					stopService(mIntent);
				} else {
					Log.i(TAG, "mIntent is null");
				}
			}
		});
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				/*
				 * Intent _intentButton1 =new Intent();
				 * _intentButton1.setAction("com.tencent.qlauncher1.BActivity")
				 * ; _intentButton1.setData(Uri.parse("http://www.baidu.com")) ;
				 * startActivity(_intentButton1) ;
				 */
				mIntent = new Intent(MainActivity.this, ShawnService.class);
				startService(mIntent);
			}
		});

		startIntentServiceButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				/*
				 * Intent _intentButton1 =new Intent();
				 * _intentButton1.setAction("com.tencent.qlauncher1.BActivity")
				 * ; _intentButton1.setData(Uri.parse("http://www.baidu.com")) ;
				 * startActivity(_intentButton1) ;
				 */
				Intent _intent = new Intent(MainActivity.this,
						ShawnIntentService.class);
				startService(_intent);
			}
		});

		bindServiceButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent binderIntent = new Intent(MainActivity.this,
						ShawnService.class);
				bindService(binderIntent, conn, Service.BIND_AUTO_CREATE);
				Log.i(TAG, "bind  Success.");
			}
		});
		
		unbindServiceButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.i("ShawnService", "unbindService") ;
				if(conn !=null){
					unbindService(conn) ;
				} else {
					Toast.makeText(MainActivity.this, "没有建立连接.", Toast.LENGTH_SHORT).show() ;
				}
			}
		});

	}

	private ServiceConnection conn = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.i("ShawnService", "onServiceDisconnected") ;

		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub

			// Toast.makeText(MainActivity.this,
			// ((mMyBinder)service).helloWorld("Jacky") ,
			// Toast.LENGTH_SHORT).show() ;
			Log.i(TAG, "Call Hello World.");
			((xMyBinder) service).SayHello("Huawei");
		}
	};
}
