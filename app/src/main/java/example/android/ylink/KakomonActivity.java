package example.android.ylink;

import example.android.ylink.S41Activity.ListItemClickListener;
import example.android.ylink.S4Activity.ButtonClickListener1;
import example.android.ylink.S4Activity.ButtonClickListener2;
import example.android.ylink.S4Activity.ButtonClickListener3;
import example.android.ylink.S4Activity.ImageButtonClickListener1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class KakomonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.kakomon);
		
		Intent data=getIntent();
		
		ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
		imagebutton1.setOnClickListener(new ImageButtonClickListener1());
		
		Button button1=(Button)findViewById(R.id.Campusinfo_bt);
		button1.setOnClickListener(new ButtonClickListener1());
		
		Button button2=(Button)findViewById(R.id.News_bt);
		button2.setOnClickListener(new ButtonClickListener2());
		
		Button button3=(Button)findViewById(R.id.Link_bt);
		button3.setOnClickListener(new ButtonClickListener3());
		
		ListView listView1=(ListView)findViewById(R.id.lv_kakomonkomoku);
		listView1.setOnItemClickListener(new ListItemClickListener());
		
	}
	
	class ImageButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(KakomonActivity.this , S1Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener1 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(KakomonActivity.this , S3Activity.class);
		    startActivity(intent);
		}
	}
	
	class ButtonClickListener2 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(KakomonActivity.this , S2Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ButtonClickListener3 implements OnClickListener{
		public void onClick(View v){
			Intent intent = new Intent(KakomonActivity.this , S5Activity.class);
		    startActivity(intent);
			
		}
	}
	
	class ListItemClickListener implements OnItemClickListener{
		public void onItemClick(AdapterView<?>parent,View view,int position,long id){
			ListView listview = (ListView)parent;
			String item = (String)listview.getItemAtPosition(position);
			
			Intent intent = new Intent(KakomonActivity.this,S41Activity.class);
			intent.putExtra("SELECTED", item);
			startActivity(intent);
			
			}
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s6, menu);
		return true;
	}

}