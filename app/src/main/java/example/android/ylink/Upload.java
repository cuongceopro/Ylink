package example.android.ylink;

import example.android.ylink.ToukouNewsActivity.ButtonClickListener1;
import example.android.ylink.ToukouNewsActivity.ButtonClickListener2;
import example.android.ylink.ToukouNewsActivity.ButtonClickListener3;
import example.android.ylink.ToukouNewsActivity.ImageButtonClickListener1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Upload extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.upload);
		
		Intent data=getIntent();
		
		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
	
		Button button1=(Button)findViewById(R.id.Campusinfo_bt);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.Share_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Link_bt);
		button3.setOnClickListener(new ButtonClickListener3());
		
	}
	
	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(Upload.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}

	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(Upload.this , S3Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(Upload.this , S4Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(Upload.this , S5Activity.class);
		    startActivity(intent);
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.toukou_news, menu);
		return true;
	}

}

