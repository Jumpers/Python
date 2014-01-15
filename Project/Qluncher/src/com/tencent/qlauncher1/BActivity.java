package com.tencent.qlauncher1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class BActivity extends Activity {
	private static final String TAG="Activity" ;
	private static int mIndex=1;
	Intent mIntent ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_activity) ;
		
		Log.i(TAG, "onCreated BActivity  "+mIndex+",taskid= "+getTaskId()) ;
		mIndex++;
		
		mIntent =this.getIntent();
		if(mIntent !=null){
			Toast.makeText(this, mIntent.getData().toString(), Toast.LENGTH_SHORT).show() ;
		}

		
		//get 2 button
		Button _button1=(Button)findViewById(R.id.buttonStartActivityA);
		Button _button2=(Button)findViewById(R.id.buttonStartActivityB);
		
		//set button1 onClickListener
		_button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent= new Intent(BActivity.this,AActivity.class) ;
				startActivity(_intent) ;
			}
		}) ;
		
		//set button2 onClickListener
		_button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent= new Intent(BActivity.this,BActivity.class) ;
				startActivity(_intent) ;
			}
		}) ;
		
		
	}
	

}
