package example.android.ylink;

import example.android.ylink.S41Activity.ButtonClickListener1;
import example.android.ylink.S41Activity.ButtonClickListener2;
import example.android.ylink.S41Activity.ButtonClickListener3;
import example.android.ylink.S41Activity.ButtonClickListener4;
import example.android.ylink.S41Activity.ImageButtonClickListener1;
import example.android.ylink.S41Activity.ListItemClickListener;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class S43Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.s43);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";
	  TextView tv1=(TextView)findViewById(R.id.shurui);
	  tv1.setText(news);

	  String[] data1={"JASSO支援金 （自然災害被災者対象）","本庄国際奨学財団奨学金","留山田長満奨学生","ヤマハ音楽支援制度","ヨネックススポーツ振興財団","ＪＴアジア奨学金","公益財団法人似鳥国際奨学財団","川嶋章司記念スカラーシップ基金"};
	  String[] data2={"JASSO支援金（自然災害被災者対象)","ヨネックス・スポーツ振興財団","交通遺児育英会","山田長満奨学生","石川県育英資金（緊急採用）","本庄国際奨学財団"};

	  ListView listView1=(ListView)findViewById(R.id.lv_shougakukin);
	  if(news.equals("外国人")){
		ArrayAdapter<String>adapter1 = new ArrayAdapter<String>(this,R.layout.listview,data1){
		    @Override
		    public View getView(int position,View convertView,ViewGroup parent){
			  TextView view = (TextView)super.getView(position, convertView, parent);
			  view.setTextSize(20);
			  return view;
		    }
		};
		listView1.setAdapter(adapter1);
	  }
	  else if(news.equals("日本人")){
		ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(this,R.layout.listview,data2){
		    @Override
		    public View getView(int position,View convertView,ViewGroup parent){
			  TextView view = (TextView)super.getView(position, convertView, parent);
			  view.setTextSize(20);
			  return view;
		    }
		};
		listView1.setAdapter(adapter2);
	  }
	  listView1.setOnItemClickListener(new ListItemClickListener());


	  ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
	  imagebutton1.setOnClickListener(new ImageButtonClickListener1());

	  Button button1=(Button)findViewById(R.id.Campusinfo_bt);
	  button1.setOnClickListener(new ButtonClickListener1());

	  Button button2=(Button)findViewById(R.id.News_bt);
	  button2.setOnClickListener(new ButtonClickListener2());

	  Button button3=(Button)findViewById(R.id.Link_bt);
	  button3.setOnClickListener(new ButtonClickListener3());

	  Button button4=(Button)findViewById(R.id.upload_bt);
	  button4.setOnClickListener(new ButtonClickListener4());

    }

    class ImageButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S43Activity.this , S1Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S43Activity.this , S3Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S43Activity.this , S2Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S43Activity.this , S5Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S43Activity.this , Upload.class);
		startActivity(intent);

	  }
    }


    class ListItemClickListener implements OnItemClickListener{
	  public void onItemClick(AdapterView<?>parent,View view,int position,long id){
		ListView listview = (ListView)parent;
		String item = (String)listview.getItemAtPosition(position);

		Intent intent = new Intent(S43Activity.this,ShareImageActivity.class);
		intent.putExtra("SELECTED", item);
		startActivity(intent);

	  }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.s43, menu);
	  return true;
    }

}
