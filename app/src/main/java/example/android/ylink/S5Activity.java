package example.android.ylink;

import example.android.ylink.ShareImageActivity.ButtonClickListener1;
import example.android.ylink.ShareImageActivity.ButtonClickListener2;
import example.android.ylink.ShareImageActivity.ButtonClickListener3;
import example.android.ylink.ShareImageActivity.ImageButtonClickListener1;
import android.net.Uri;
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

public class S5Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.s5);
		
		Intent data=getIntent();
		
		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
		
		Button button1=(Button)findViewById(R.id.Campusinfo_bt);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.News_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Share_bt);
		button3.setOnClickListener(new ButtonClickListener3());
		
		ImageButton imagebutton7=(ImageButton)findViewById(R.id.YNUhome);
		imagebutton7.setOnClickListener(new ImageButtonClickListener7());
		
		ImageButton imagebutton2=(ImageButton)findViewById(R.id.kiban);
		imagebutton2.setOnClickListener(new ImageButtonClickListener2());
		
		ImageButton imagebutton3=(ImageButton)findViewById(R.id.OPAC);
		imagebutton3.setOnClickListener(new ImageButtonClickListener3());
		
		ImageButton imagebutton4=(ImageButton)findViewById(R.id.shienka);
		imagebutton4.setOnClickListener(new ImageButtonClickListener4());
		
		ImageButton imagebutton5=(ImageButton)findViewById(R.id.ryugakusei);
		imagebutton5.setOnClickListener(new ImageButtonClickListener5());
		
		ImageButton imagebutton6=(ImageButton)findViewById(R.id.shirabasu);
		imagebutton6.setOnClickListener(new ImageButtonClickListener6());
	}

	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S5Activity.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S5Activity.this , S3Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S5Activity.this , S2Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S5Activity.this , S4Activity.class);
		    startActivity(intent);
			
		}
	}
	
	
	
	class ImageButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("http://www.itsc.ynu.ac.jp/"));
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("http://opac.lib.ynu.ac.jp/opc/"));
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener4 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("http://www.gakuseisupport.ynu.ac.jp/"));
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener5 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("http://www.isc.ynu.ac.jp/"));
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener6 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("https://risyu.jmk.ynu.ac.jp/gakumu/Public/Syllabus/"));
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener7 implements OnClickListener{
		public void onClick(View v){
			String action=null;
			action="android.intent.action.VIEW";
			Intent intent = new Intent(action,Uri.parse("http://www.ynu.ac.jp/"));
		    startActivity(intent);
			
		}
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s5, menu);
		return true;
	}

}
