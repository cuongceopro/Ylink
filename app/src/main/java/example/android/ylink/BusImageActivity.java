package example.android.ylink;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class BusImageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.bus_image);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";
	  ImageView image = (ImageView)findViewById(R.id.bus_image);


	  if(news.equals("横浜国立正門前")){
		image.setImageResource(R.drawable.seimonmae);
	  }
	  else if(news.equals("国大西")){
		image.setImageResource(R.drawable.nishi);
	  }
	  else if(news.equals("国大中央")){
		image.setImageResource(R.drawable.chuuou);
	  }
	  else if(news.equals("国大南門")){
		image.setImageResource(R.drawable.minami);
	  }
	  else if(news.equals("国大北")){
		image.setImageResource(R.drawable.kita);
	  }
	  else if(news.equals("大学会館前")){
		image.setImageResource(R.drawable.kaikanmae);
	  }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.bus_image, menu);
	  return true;
    }

}
