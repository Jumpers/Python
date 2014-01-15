package com.tencent.qlauncher1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MusicPlayActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_musicplay) ;
		
		//找到对应的按扭
		Button buttonPlay =(Button)findViewById(R.id.buttonPlay) ;
		Button buttonStop =(Button)findViewById(R.id.buttonStop) ;
		Button buttonPause =(Button)findViewById(R.id.buttonPause) ;
		
		//对按扭添加事件 －播放
		buttonPlay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent = new Intent(MusicPlayActivity.this,ShawnService.class) ;
				_intent.putExtra("musicCommand", 1) ;
				startService(_intent) ;
				
				Toast.makeText(MusicPlayActivity.this, "开始播放音乐", Toast.LENGTH_SHORT).show() ;
				
			}
		});
		
		//对按扭添加事件 －暂停
		buttonPause.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent= new Intent(MusicPlayActivity.this,ShawnService.class) ;
				_intent.putExtra("musicCommand", 2) ;
				startService(_intent) ;
				Toast.makeText(MusicPlayActivity.this, "音乐暂停", Toast.LENGTH_SHORT).show() ;
				
			}
		});
		
		//对按扭添加事件 －停止
		buttonStop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent _intent =new Intent(MusicPlayActivity.this, ShawnService.class) ;
				_intent.putExtra("musicCommand", 3) ;
				startService(_intent) ;
				
				Toast.makeText(MusicPlayActivity.this, "音乐停止", Toast.LENGTH_SHORT).show() ;
			}
		});
		
		
	}
	

}
