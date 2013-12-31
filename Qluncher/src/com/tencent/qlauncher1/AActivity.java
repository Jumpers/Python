package com.tencent.qlauncher1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AActivity extends Activity {
	private static int mIndex=1 ;
	private static final String TAG="Activity" ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity) ;
		
		Log.i(TAG, "onCreated AActivity  "+mIndex +",taskid= "+getTaskId()) ;
		mIndex++;

		
		//get 2 button
		Button _button1=(Button)findViewById(R.id.buttonStartActivityA);
		Button _button2=(Button)findViewById(R.id.buttonStartActivityB);
		
		//set button1 onClickListener
		_button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent= new Intent(AActivity.this,AActivity.class) ;
				startActivity(_intent) ;
			}
		}) ;
		
		//set button2 onClickListener
		_button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent= new Intent(AActivity.this,BActivity.class) ;
				startActivity(_intent) ;
			}
		}) ;
		
		
	}

	@Override
	protected void onNewIntent(Intent intent) {
		// TODO Auto-generated method stub
		super.onNewIntent(intent);
		Log.i(TAG, "AActivity new Intent started.") ;
	}
	

}
