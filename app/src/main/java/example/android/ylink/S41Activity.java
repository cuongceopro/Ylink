package example.android.ylink;

import example.android.ylink.S2Activity.ListItemClickListener;
import example.android.ylink.S4Activity.ButtonClickListener1;
import example.android.ylink.S4Activity.ButtonClickListener2;
import example.android.ylink.S4Activity.ButtonClickListener3;
import example.android.ylink.S4Activity.ImageButtonClickListener1;
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

public class S41Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.s41);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";
	  TextView tv1=(TextView)findViewById(R.id.shurui);
	  tv1.setText(news);

	  String[] data1={"日本国憲法ー2006"};
	  String[] data2={"現代経済Aー2013期末ー亀卦川","基礎化学I期末試験ー2013ー栗原","線形代数Ⅰー2008ー伊澤","統計Ⅱー20081","統計Ⅱー20082","統計Ⅱー20083"};
	  String data3[]={"国民会計論ー2007－大森","マーケティング論1","マーケティング論2"};
	  String data4[]={"計算機アーキテクチャ期末ー2012松本1","計算機アーキテクチャ期末ー2012松本2"};
	  String data5[]={"熱力学期末ー2012後期ー野村1","熱力学期末ー2012後期ー野村1",
		    "熱力学期末ー2012後期ー野村2",
		    "材料力学I －H21中間試験解答",
		    "微分積分Iー2006ー平田1",
		    "微分積分Iー2006ー平田2",
		    "微分積分Iー2006ー平田3",
		    "微分積分Iー2006ー平田4",
		    "物理学Aー2006ー鈴木",
		    "流体力学ーH20期末1",
		    "流体力学ーH20期末2"};


	  ListView listView1=(ListView)findViewById(R.id.lv_kakomonimage);
	  if(news.equals("一般教養")){
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
	  else if(news.equals("教育")){
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
	  else if(news.equals("経営")){

		ArrayAdapter<String>adapter3 = new ArrayAdapter<String>(this,R.layout.listview,data3){
		    @Override
		    public View getView(int position,View convertView,ViewGroup parent){
			  TextView view = (TextView)super.getView(position, convertView, parent);
			  view.setTextSize(20);
			  return view;
		    }
		};
		listView1.setAdapter(adapter3);

	  }
	  else if(news.equals("経済")){
		ArrayAdapter<String>adapter4 = new ArrayAdapter<String>(this,R.layout.listview,data4){
		    @Override
		    public View getView(int position,View convertView,ViewGroup parent){
			  TextView view = (TextView)super.getView(position, convertView, parent);
			  view.setTextSize(20);
			  return view;
		    }
		};
		listView1.setAdapter(adapter4);
	  }
	  else if(news.equals("理工")){
		ArrayAdapter<String>adapter5 = new ArrayAdapter<String>(this,R.layout.listview,data5){
		    @Override
		    public View getView(int position,View convertView,ViewGroup parent){
			  TextView view = (TextView)super.getView(position, convertView, parent);
			  view.setTextSize(20);
			  return view;
		    }
		};

		listView1.setAdapter(adapter5);
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
		Intent intent = new Intent(S41Activity.this , S1Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S41Activity.this , S3Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S41Activity.this , S2Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S41Activity.this , S5Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S41Activity.this , Upload.class);
		startActivity(intent);

	  }
    }

    class ListItemClickListener implements OnItemClickListener{
	  public void onItemClick(AdapterView<?>parent,View view,int position,long id){
		ListView listview = (ListView)parent;
		String item = (String)listview.getItemAtPosition(position);

		Intent intent = new Intent(S41Activity.this,ShareImageActivity.class);
		intent.putExtra("SELECTED", item);
		startActivity(intent);

	  }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.s41, menu);
	  return true;
    }

}
