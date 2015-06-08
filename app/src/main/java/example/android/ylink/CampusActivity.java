package example.android.ylink;

import example.android.ylink.NewsActivity.ButtonClickListener1;
import example.android.ylink.NewsActivity.ButtonClickListener2;
import example.android.ylink.NewsActivity.ButtonClickListener3;
import example.android.ylink.NewsActivity.ButtonClickListener4;
import example.android.ylink.NewsActivity.ImageButtonClickListener1;
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
import android.widget.TextView;
import android.widget.Toast;

public class CampusActivity extends Activity {
    String link="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.campus);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";

	  TextView tv1=(TextView)findViewById(R.id.tema_text);
	  tv1.setText("テーマ：　"+news);
	  TextView tv2=(TextView)findViewById(R.id.naiyou);
	  TextView tv3=(TextView)findViewById(R.id.comment_text);


	  if(news.equals("Y－LINKが誕生！！！まずは検索！！！")){
		tv2.setText("学生アプリケーションコンテストにベトナム人留学生チームが優勝");
		tv3.setText("―おめでとうございます"+"\n"+
				    "―よくやりましたね！"+"\n"+
				    "―ええ、どういものかな？"+"\n"+
				    "―使ってみました、なかなかいいアプリだ！！"+"\n"+
				    "―まずは便利、これは使い続けれるはずだ！！！"
		);
	  }
	  else if(news.equals("学生アプリコンテスト(賞品5万円も!!!)")){
		tv2.setText("学生アプリケーションコンテスト作品募集中（賞金5万円も！！！）");
		tv3.setText("‐ITはわからないけど、参加できるかな？"+"\n"+"‐興味がある人は一緒にチームを作りましょう！！！"+"\n"+
			  "－新しいアプリを楽しみにしています"+"\n"+
			  "－なんか、学校のサービスをよくまとめできるものがいいな！！！"+"\n"+
			  "－去年参加してよかった。今年もさんかする！");
		link="http://www.itsc.ynu.ac.jp/about_us/appcomp.html";
	  }
	  else if(news.equals("ついに、OFFICEが配布された！！！")){
		tv2.setText("学部生・大学院生向け Office が配布される！！");
		tv3.setText("―待ちに待ってだね！！！"+"\n"+
			  "―これは助かります"+"\n"+
			  "－新しいアプリを楽しみにしています"+"\n"+
			  "－なんか、学校のサービスをよくまとめできるものがいいな！！！"+"\n"+
			  "－去年参加してよかった。今年もさんかする！");
		link="http://www.itsc.ynu.ac.jp/service/student_msoffice_haifu.html";
	  }
	  else if(news.equals("英語の会話練習のお願い!!!")){
		tv2.setText("英語の会話練習をしたいですが、協力していただける方がいらっしゃいますか？"+"\n"+"逆に、日本語を教えてあげることもで来ます。");
		tv3.setText("留学生です。一緒にやりたいね。"+"\n"+
			  "―本当ですか？"+"\n"+
			  "－本当ですよ！！！"+"\n"+
			  "－打ち合わせはどうすればいいかな？"+"\n"+
			  "－中央図書館にいます");
	  }
	  else if(news.equals("今年のハロウィンは学内に何かあるかな？")){
		tv2.setText("今年のハロウィンは学内に何かあるかな？？？");
		tv3.setText("やります、３１日の夜、留学センターで留学生とやります！！　ぜひ来てください！！！"+"\n"+
			  "―学校全体でやりましょう"+"\n"+
			  "－学校全体でやりたいね！！！"+"\n"+
			  "－やります、３１日の夜、留学センターで留学生とやります！！"+"\n"+
			  "－経営学部がやります。だけど、YNUの学生ならだれもが参加できる！");
	  }
	  else if(news.equals("横浜弁当が本日の17時まで全品100円引き!")){
		tv2.setText("横浜弁当が本日の17時まで全品100円引き！！！");
		tv3.setText("皆急いで！！！"+"\n"+
			  "―皆急いで！！！"+"\n"+
			  "－皆急いで！！！"+"\n"+
			  "－皆急いで！！！"+"\n"+
			  "－皆急いで！！！");
	  }


	  else if(news.equals("今週の木曜日英会話の練習を行います")){
		tv2.setText("今週の木曜日６限に国際教育センター105室にて英会話の練習を行います");
		tv3.setText("皆、気楽に参加しましょう！（105室により）"+"\n"+
			  "―参加したいです！ "+"\n"+
			  "－参加したい！"+"\n"+
			  "－わたしも"+"\n"+
			  "－うちも");
	  }
	  else if(news.equals("ベトナムサッカーチームが交流相手を探している")){
		tv2.setText("ベトナム人留学生サッカーチームが交流相手を探している。"+"\n"+"時間：11月23日(日)　場所：学外グラウンド");
		tv3.setText("やりたい"+"\n"+
			  "―代表者の連絡先を教えて！"+"\n"+
			  "－けど4人しかいない"+"\n"+
			  "－大丈夫！こっちは10人もいるから"+"\n"+
			  "－よっ！やるぜー");
	  }
	  else if(news.equals("理工学部 都市基盤EPチームが入賞")){
		tv2.setText("理工学部 都市基盤EPチームがブリッジコンペティションアジア大会で総合3位入賞");
		tv3.setText("これはすごい！！！さすがYNU "+"\n"+
			  "―すごいね！おめでとう！"+"\n"+
			  "－おめでとー"+"\n"+
			  "－すごい！！！"+"\n"+
			  "－すげえええ");
		link="http://www.ynu.ac.jp/hus/engk2/11506/detail.html";
	  }
	  else if(news.equals("深夜の原付がすごくうるさい!!")){
		tv2.setText("深夜の原付がすごくうるさいということに気づきました。");
		tv3.setText("皆気を付けましょう！"+"\n"+
			  "―本当にうるさい！"+"\n"+
			  "－もうやめてほしい！！！"+"\n"+
			  "－ね！"+"\n"+
			  "－すみません！気をつけますっ");
	  }
	  else if(news.equals("履修登録の締き切が迫っています")){
		tv2.setText("履修登録の締き切が迫っています。");
		tv3.setText("やばい！完全に忘れてたわ＠＠"+"\n"+
			  "―登録終わったわ"+"\n"+
			  "－何回もやろうとして忘れちゃったわ（汗）よかった！"+"\n"+
			  "－わたしも同じ状況（笑）"+"\n"+
			  "－うちも！これを読んでよかった！！！");
	  }

	  else if(news.equals("YNU NEWS が月曜から出版")){
		tv2.setText("YNU NEWS が月曜から出版。学内のHOT NEWsがいっぱい乗せられています");
		tv3.setText("へー！面白そう！"+"\n"+
			  "―たのしみー！"+"\n"+
			  "－早く読みたい！"+"\n"+
			  "－何があるんだろうな。。。"+"\n"+
			  "－へー");
		link="http://www.ynu.ac.jp/hus/engk2/11506/detail.html";
	  }
	  else if(news.equals("国費国内採用の募集が公開しました！")){
		tv2.setText("国費国内採用の募集が公開しました！登録締切は来週の月曜日なので、皆チェックを忘れないでください！");
		tv3.setText("ありがとう"+"\n"+
			  "―サンキュー"+"\n"+
			  "－いぇー、応募するぜー"+"\n"+
			  "－ありがとう"+"\n"+
			  "－情報、ありがとう！やさしいね＾＾");
		link="http://www.gakuseisupport.ynu.ac.jp/";
	  }
	  else if(news.equals("学内の日本語スピーチコンテスト！！！")){
		tv2.setText("見逃さないでください。学内の日本語スピーチコンテスト！！！");
		tv3.setText("日本人だから参加できそうにない（苦笑）"+"\n"+
			  "―聞きにきて～"+"\n"+
			  "－いきたい"+"\n"+
			  "－今年もあるんだね！去年参加したわ＾＾"+"\n"+
			  "－発表しようと思っているからアドバイスして＾＾");
		link="http://www.ynu.ac.jp/hus/exce/12490/detail.html";
	  }
	  else if(news.equals("「ROUTEプロジェクト」成果発表会を開催しました")){
		tv2.setText("理工学部機械工学EP「ROUTEプロジェクト」成果発表会を開催しました");
		tv3.setText("へー。なにそれ？"+"\n"+
			  "―リンクを押せば見れるよ！"+"\n"+
			  "－本当だ！すごい！行きたい！！！"+"\n"+
			  "－ぜひぜひ。。。"+"\n"+
			  "－いく！！！");
		link="http://www.ynu.ac.jp/hus/engk3/12376/detail.html ";
	  }


	  ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
	  imagebutton1.setOnClickListener(new ImageButtonClickListener1());

	  Button button1=(Button)findViewById(R.id.News_bt);
	  button1.setOnClickListener(new ButtonClickListener1());

	  Button button2=(Button)findViewById(R.id.Share_bt);
	  button2.setOnClickListener(new ButtonClickListener2());

	  Button button3=(Button)findViewById(R.id.Link_bt);
	  button3.setOnClickListener(new ButtonClickListener3());

	  Button button4=(Button)findViewById(R.id.readnews_bt);
	  button4.setOnClickListener(new ButtonClickListener4());

    }

    class ImageButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(CampusActivity.this , S1Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(CampusActivity.this , S2Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(CampusActivity.this , S4Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(CampusActivity.this , S5Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		if(link.equals("")){
		    Toast.makeText(CampusActivity.this, "リンクがありません！", Toast.LENGTH_SHORT).show();
		}
		else {
		    String action=null;
		    action="android.intent.action.VIEW";
		    Intent intent = new Intent(action,Uri.parse(link));
		    startActivity(intent);
		}
	  }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.campus, menu);
	  return true;
    }

}
