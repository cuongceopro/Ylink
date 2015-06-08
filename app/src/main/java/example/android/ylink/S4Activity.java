package example.android.ylink;

import example.android.ylink.S2Activity.ButtonClickListener2;
import example.android.ylink.S2Activity.ButtonClickListener3;
import example.android.ylink.S2Activity.ButtonClickListener4;
import example.android.ylink.S2Activity.ImageButtonClickListener1;
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

public class S4Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.s4);
		
		Intent data=getIntent();
		

		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
		
		ImageButton imagebutton2=(ImageButton)findViewById(R.id.kakomon);
		imagebutton2.setOnClickListener(new ImageButtonClickListener2());
		
		ImageButton imagebutton3=(ImageButton)findViewById(R.id.baito);
		imagebutton3.setOnClickListener(new ImageButtonClickListener3());
		
		ImageButton imagebutton4=(ImageButton)findViewById(R.id.shougakukin);
		imagebutton4.setOnClickListener(new ImageButtonClickListener4());
		
		ImageButton imagebutton5=(ImageButton)findViewById(R.id.heya);
		imagebutton5.setOnClickListener(new ImageButtonClickListener5());
		
		ImageButton imagebutton6=(ImageButton)findViewById(R.id.other);
		imagebutton6.setOnClickListener(new ImageButtonClickListener6());
		
		
		Button button1=(Button)findViewById(R.id.Campusinfo_bt);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.News_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Link_bt);
		button3.setOnClickListener(new ButtonClickListener3());
		
	}

	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , KakomonActivity.class);
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S42Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener4 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , Shougakukin.class);
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener5 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S44Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ImageButtonClickListener6 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S45Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S3Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S2Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(S4Activity.this , S5Activity.class);
		    startActivity(intent);
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s4, menu);
		return true;
	}

}
