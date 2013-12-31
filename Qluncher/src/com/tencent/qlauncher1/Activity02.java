package com.tencent.qlauncher1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Activity02 extends Activity {
    Intent mIntent01;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2) ;
		
		//add textview 		
		Button _Button= new Button(this) ;
		_Button.setText("自动添加的Button.") ;
		LinearLayout ll =(LinearLayout)findViewById(R.id.linearlayout02) ;
		ll.addView(_Button);
		
		mIntent01 =this.getIntent();
		String _Intent01Value ;
		if(mIntent01 != null)
		{
			_Intent01Value =mIntent01.getExtras().getString("com.tencent.qlauncher1.ACTIVITY02") ;
			Toast.makeText(this, ""+_Intent01Value, Toast.LENGTH_SHORT).show() ;
		}
		
		
		//add onClickListener
		_Button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				mIntent01.putExtra("com.tencent.qlauncher1.ACTIVITY02", "Hello ,你好 我是activity02") ;
				setResult(4321, mIntent01) ;
				finish();
			}
		});
		
		
		
	}
	
	
}
