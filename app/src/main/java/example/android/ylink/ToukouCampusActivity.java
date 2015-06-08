package example.android.ylink;

import example.android.ylink.ToukouNewsActivity.ButtonClickListener1;
import example.android.ylink.ToukouNewsActivity.ButtonClickListener2;
import example.android.ylink.ToukouNewsActivity.ButtonClickListener3;
import example.android.ylink.ToukouNewsActivity.ImageButtonClickListener1;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class ToukouCampusActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.toukou_campus);
		
		Intent data=getIntent();
		
		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
	
		Button button1=(Button)findViewById(R.id.News_bt);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.Share_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Link_bt);
		button3.setOnClickListener(new ButtonClickListener3());
	}

	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(ToukouCampusActivity.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}

	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(ToukouCampusActivity.this , S2Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(ToukouCampusActivity.this , S4Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(ToukouCampusActivity.this , S5Activity.class);
		    startActivity(intent);
			
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.toukou_campus, menu);
		return true;
	}

}
