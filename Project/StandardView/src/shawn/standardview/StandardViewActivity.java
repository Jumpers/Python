package shawn.standardview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class StandardViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		mScrollView =(ScrollView) findViewById(R.id.mscrollview) ;
		setContentView(R.layout.activity_standard_view) ;
		showText() ;
		showCheckbox() ;
		showRadiobox() ;
	}
	
	private void showRadiobox(){
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup) ;
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.radio1:
					Toast.makeText(StandardViewActivity.this, "hell world", Toast.LENGTH_SHORT).show() ;
					break;
				case R.id.radio2:
					Toast.makeText(StandardViewActivity.this, "hell world", Toast.LENGTH_SHORT).show() ;
					break ;
				case R.id.radio3:
					Toast.makeText(StandardViewActivity.this, "hell world", Toast.LENGTH_SHORT).show() ;
					break ;
				default:
					break;
				}
				
			}
		}) ;
	}
	
	private void showCheckbox(){
		CheckBox mCheckBox = (CheckBox) findViewById(R.id.checkbox1) ;
		mCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (isChecked) {
					Toast.makeText(StandardViewActivity.this, "Checked", 2000).show() ;
				} else {
					Toast.makeText(StandardViewActivity.this, "unChecked", 2000).show() ;
				}
			}
		}) ;
	}

	
	private void showText(){
		TextView textView =(TextView) findViewById(R.id.tv1) ;
		SpannableStringBuilder spannableStringBuilder =new SpannableStringBuilder("nice.to.meet.you!") ;
		ImageSpan imageSpan = new ImageSpan(StandardViewActivity.this, R.drawable.button2) ;
		//ForegroundColorSpan foregroundColorSpan =new ForegroundColorSpan(Color.YELLOW) ;
		//spannableStringBuilder.setSpan(foregroundColorSpan, 0, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) ;
		ClickableSpan clickableSpan = new ClickableSpan() {
			
			@Override
			public void onClick(View widget) {
				// TODO Auto-generated method stub
				Log.i("shawn.xiao", "click this.") ;
				Toast.makeText(StandardViewActivity.this, "hello world", Toast.LENGTH_SHORT).show() ;
			}
		};
		spannableStringBuilder.setSpan(clickableSpan, 7, 17, Spannable.SPAN_INCLUSIVE_INCLUSIVE) ;
		spannableStringBuilder.setSpan(imageSpan, 3, 4, Spannable.SPAN_INCLUSIVE_INCLUSIVE) ;
		textView.setText(spannableStringBuilder) ;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.standard_view, menu);
		return true;
	}

}
