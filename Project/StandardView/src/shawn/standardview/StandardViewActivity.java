package shawn.standardview;

import org.xml.sax.XMLReader;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class StandardViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_standard_view);
		showText();
	}
	

	
	private void showText(){
		
		
/*		ImageGetter imageGetter =new ImageGetter() {
			
			@Override
			public Drawable getDrawable(String arg0) {
				// TODO Auto-generated method stub
				//Bitmap.createBitmap("http://a.fsdn.com/con/app/proj/staruml/screenshots/48455.jpg") ;
				BitmapDrawable mBitmapDrawable=(BitmapDrawable)getResources().getDrawable(R.drawable.ic_launcher);
				mBitmapDrawable.setBounds(0, 0, mBitmapDrawable.getIntrinsicWidth(), mBitmapDrawable.getIntrinsicHeight()) ;
				return mBitmapDrawable;
			}
		};
		TagHandler tagHandler =new TagHandler() {
			
			@Override
			public void handleTag(boolean arg0, String arg1, Editable arg2,
					XMLReader arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(StandardViewActivity.this, arg1, 2000).show();
			}
		};*/
		
		TextView textview1 =(TextView)findViewById(R.id.textview1);
		textview1.setText("");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.standard_view, menu);
		return true;
	}

}
