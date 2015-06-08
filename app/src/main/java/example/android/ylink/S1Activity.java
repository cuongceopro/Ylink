package example.android.ylink;

import android.net.Uri;
import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.view.ViewGroup;

public class S1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.s1);

	  Intent data=getIntent();

	  String[] data1={"ＴＰＰ、終局が明確になりつつある","ぎこちない握手も思惑通り","＜ＴＰＰ首脳会合＞合意時期示せず","御嶽山噴火","遺伝子操作で青い光がバナナの匂いに？","日中首脳、火種抱え「関係改善へ努力」"};
	  ArrayAdapter<String>adapter1 = new ArrayAdapter<String>(this,R.layout.listview,data1){
		@Override
		public View getView(int position,View convertView,ViewGroup parent){
		    TextView view = (TextView)super.getView(position, convertView, parent);
		    view.setTextSize(18);
		    return view;
		}
	  };

	  ListView listView1=(ListView)findViewById(R.id.listview1);
	  listView1.setAdapter(adapter1);
	  listView1.setOnItemClickListener(new ListItemClickListener());

	  String[] data2={"Y－LINKが誕生！！！まずは検索！！！","学生アプリコンテスト(賞品5万円も!!!)",
		    "ついに、OFFICEが配布された！！！","英語の会話練習のお願い!!!","今年のハロウィンは学内に何かあるかな？","横浜弁当が本日の17時まで全品100円引き!"};
	  ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(this,R.layout.listview,data2){
		@Override
		public View getView(int position,View convertView,ViewGroup parent){
		    TextView view = (TextView)super.getView(position, convertView, parent);
		    view.setTextSize(18);
		    return view;
		}
	  };

	  ListView listView2=(ListView)findViewById(R.id.listview2);
	  listView2.setAdapter(adapter2);
	  listView2.setOnItemClickListener(new ListItemClickListener());



	  Button button1=(Button)findViewById(R.id.News_bt);
	  button1.setOnClickListener(new ButtonClickListener1());

	  Button button11=(Button)findViewById(R.id.readmore_bt);
	  button11.setOnClickListener(new ButtonClickListener1());

	  Button button2=(Button)findViewById(R.id.Campusinfo_bt);
	  button2.setOnClickListener(new ButtonClickListener2());

	  Button button21=(Button)findViewById(R.id.campusreadmore_bt);
	  button21.setOnClickListener(new ButtonClickListener2());

	  Button button3=(Button)findViewById(R.id.Share_bt);
	  button3.setOnClickListener(new ButtonClickListener3());

	  Button button4=(Button)findViewById(R.id.Link_bt);
	  button4.setOnClickListener(new ButtonClickListener4());

	  ImageButton imagebutton1=(ImageButton)findViewById(R.id.Mypage_bt);
	  imagebutton1.setOnClickListener(new ImageButtonClickListener1());

	  ImageButton imagebutton2=(ImageButton)findViewById(R.id.Tenki_bt);
	  imagebutton2.setOnClickListener(new ImageButtonClickListener2());

	  ImageButton imagebutton3=(ImageButton)findViewById(R.id.Bus_bt);
	  imagebutton3.setOnClickListener(new ImageButtonClickListener3());
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , S2Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , S3Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , S4Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , S5Activity.class);
		startActivity(intent);

	  }
    }


    class ImageButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , S6Activity.class);
		startActivity(intent);

	  }
    }

    class ImageButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		String action=null;
		action="android.intent.action.VIEW";
		Intent intent = new Intent(action,Uri.parse("http://www.toshin.com/weather/detail.php?id=364"));
		startActivity(intent);

	  }
    }

    class ImageButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(S1Activity.this , BusActivity.class);
		startActivity(intent);

	  }
    }

    class ListItemClickListener implements OnItemClickListener{
	  public void onItemClick(AdapterView<?>parent,View view,int position,long id){
		ListView listview = (ListView)parent;
		String item = (String)listview.getItemAtPosition(position);

		if(item.equals("ＴＰＰ、終局が明確になりつつある")||item.equals("ぎこちない握手も思惑通り")||item.equals("＜ＴＰＰ首脳会合＞合意時期示せず")||item.equals("御嶽山噴火")||item.equals("遺伝子操作で青い光がバナナの匂いに？")||item.equals("日中首脳、火種抱え「関係改善へ努力」")){
		    Intent intent = new Intent(S1Activity.this,NewsActivity.class);
		    intent.putExtra("SELECTED", item);
		    startActivity(intent);
		}
		else {
		    Intent intent = new Intent(S1Activity.this,CampusActivity.class);
		    intent.putExtra("SELECTED", item);
		    startActivity(intent);
		}
	  }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.s1, menu);
	  return true;
    }

}
