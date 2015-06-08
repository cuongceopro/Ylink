package example.android.ylink;

import example.android.ylink.S2Activity.ButtonClickListener2;
import example.android.ylink.S2Activity.ButtonClickListener3;
import example.android.ylink.S2Activity.ButtonClickListener4;
import example.android.ylink.S2Activity.ImageButtonClickListener1;
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

public class NewsActivity extends Activity {
    String link="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.news);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";

	  TextView tv1=(TextView)findViewById(R.id.tema_text);
	  tv1.setText("テーマ：　"+news);
	  TextView tv2=(TextView)findViewById(R.id.naiyou);
	  TextView tv3=(TextView)findViewById(R.id.comment_text);


	  if(news.equals("ＴＰＰ、終局が明確になりつつある")){
		tv2.setText("植民地化が明確になりつつある。そもそも選挙公約で自民党はTPP反対ではなかったでしょうか。いい加減安倍政権の終局明確にして欲しいと思います。");
		tv3.setText("いよいよ、決着？自民党は、ＴＰＰ反対で農協（ＪＡ）票を獲得し、結果大勝したんじゃないの？いつの間にか・・・交渉成立・・・ですか？？？+”\n”+日本の農業は大丈夫かな？+”\n”+日本の農業は大丈夫かな？");
		link="http://headlines.yahoo.co.jp/hl?a=20141110-00050092-yom-bus_all";
	  }
	  else if(news.equals("ぎこちない握手も思惑通り")){
		tv2.setText("世論を気にして虚勢をはる中国政府。一体どっちが独裁国家なの？わたしには分かりません、何故会談する必要があるのかと。。");
		tv3.setText("日本主導で日中関係をコントロールするための第一歩！焦るべからず "+"\n"+"弱いクネには愛想笑いするが、強い安倍総理には冷たくあたる。わかりやすすぎる。安倍総理の勝ちですよ。 "+"\n"+"もう、友好とか要らんだろ～日本の利益の為に～ 【日中首脳会談】ぎこちない握手も思惑通り");
		link="http://www.sankei.com/politics/news/141110/plt1411100037-n1.html";
	  }
	  else if(news.equals("＜ＴＰＰ首脳会合＞合意時期示せず")){
		tv2.setText("植民地化が明確になりつつある。そもそも選挙公約で自民党はTPP反対ではなかったでしょうか。いい加減安倍政権の終局明確にして欲しいと思います。");
		tv3.setText("いよいよ、決着？自民党は、ＴＰＰ反対で農協（ＪＡ）票を獲得し、結果大勝したんじゃないの？いつの間にか・・・交渉成立・・・ですか？？？"+"\n"+"日本の農業は大丈夫かな？"+"\n"+"日本の農業は大丈夫かな？");
		link = "http://www.tv-tokyo.co.jp/mv/wbs/news/post_78497";
	  }
	  else if(news.equals("御嶽山噴火")){
		tv2.setText("不明の６人、家族の意向で「死亡証明」　長野県が書類発行へ");
		tv3.setText("N家族も捜索隊も、さぞや無念だったろう"+"\n"+"家族も捜索隊も、さぞや無念だったろう"+"\n"+"家族、つらいなぁ。でも、残された家族には生活があるしなぁ。"+"\n"+"【御嶽山噴火】不明の６人、家族の意向で「死亡証明」　長野県が書類発行へ"+"\n"+"家族も捜索隊も、さぞや無念だったろう");
		link="http://www.sankei.com/affairs/news/141111/afr1411110032-n1.html";
	  }
	  else if(news.equals("遺伝子操作で青い光がバナナの匂いに？")){
		tv2.setText("これはすごい！！！どんな仕組みかな？");
		tv3.setText("ええっ、何のため"+"\n"+"青い光を、熟れたバナナのにおいと感じるように遺伝子を組み換えたショウジョウ+”\n”+バエの研究が発表された"+"\n"+"―新たな経営業が誕生するかも！！！！");
		link = "http://www.nationalgeographic.co.jp/news/news_article.php?file_id=20100601001";
	  }
	  else if(news.equals("日中首脳、火種抱え「関係改善へ努力」")){
		tv2.setText("スウェーデン王立科学アカデミーは7日、2014年のノーベル物理学賞を、実用的な青色発光ダイオード（LED）を開発した赤崎勇名城大教授（85）と 天野浩名古屋大教授（54）、中村修二米カリフォルニア大サンタバーバラ校教授（60）に授与すると発表した。青色の登場でLEDは赤、緑とともに光の三 原色がそろい用途が拡大。消費電力が少なく、耐久性が高い特長が注目され、白熱電球や蛍光灯に代わる白色照明のほか、携帯電話などのディスプレー、交通信 号などに広く利用されている");
		tv3.setText("なぁに 韓国は ノーベル賞 貰ったこと無いんだって？"+"\n"+"なんで朝鮮云々が出てくるんだよ。中村修二さんは日本に捨てられて国を捨てた。アメリカ人として生き、大事を成し遂げた。すごい人だろ。国籍とか関係ねえよ。"+"\n"+"漫画についての著作権とかについてはブーブー文句言うのに、中村さんに対しては手厳しいこというな。");
		link="http://www.asahi.com/articles/ASGCB5R62GCBUTFK00C.html?iref=comtop_6_01";
	  }
	  else if(news.equals("習近平主席の主催で夕食会、ＡＰＥＣが実質開幕")){
		tv2.setText("２１か国・地域が参加するアジア太平洋経済協力会議（ＡＰＥＣ）首脳会議は、１０日夜、中国の習近平（シージンピン）国家主席が主催する夕食会が北京で開かれ、実質的に開幕した。");
		tv3.setText("良いね"+"\n"+"これから、期待できるね、"+"\n"+"良いね");
		link="http://www.msn.com/ja-jp/news/world/ar-AA7qnjN";
	  }
	  else if(news.equals("原点に立ち戻って関係改善する第一歩＝日中首脳会談で安倍首相")){
		tv2.setText("安倍晋三首相は１０日、中国の習近平国家主席と北京で会談した後、記者団に対し、「戦略的互恵関係の原点に立ち戻って関係を改善させていく第一歩になった」と評価した。");
		tv3.setText("中国には弱みを見せては絶対行けない。絶対に妥協せず気長に交渉すればよし。焦って足元を見られるのが一番良くない。靖国参拝は逆にやってやれば良い。"+"\n"+"会談実現は目的ではない。これからお互い歩み寄る必要はあると思う。閣僚を含め、相手を刺激するような行動を取るべきではない。個人的に参拝したいなら、公人である閣僚をまず辞めてくださいね。"+"\n"+"全世界に「いやそうな」顔、表情が流されました。"+"\n"+"写真の表情が．．．(ﾟДﾟ)");
		link="http://www.msn.com/ja-jp/news/national/ar-AA7nBRB";
	  }
	  else if(news.equals("楽天が出版取次｢大阪屋｣に出資する事情")){
		tv2.setText("10月28日、経営再建中で出版取次3位の大阪屋が開いた、臨時株主総会。楽天など、6社に対する第三者割当増資の議案が出されると、一部の株主から反対 の声が上がった。しかし、最終的に拍手で賛意が確認され、株主総会は終了。楽天は14億円を拠出し(出資比率35.19％)、大阪屋の筆頭株主となる。");
		tv3.setText("天の営業方針とアマゾンとは全くと言うほど違う！勘違いするな「楽天」！しょせん田舎者が考えた仮想の商店街楽天！・・・今後も一切楽天を関して買うことは無い！・・・"+"\n"+"三木谷氏の先見性と実行力は大したものだが、実は楽天の販売システムねずみ講と極めて似ている、出店者が利益を出せば出すほど楽天は利益が生まれ、出店者が売れなくともシステム利用料が入るので損失は無い。"+"\n"+"いんちき商品を誇大広告で販売する店舗を奨励する楽天に興味はありません。最近はリクルートもそんなことやっているね。"+"\n"+"三木谷なんか無理");
		link="http://www.msn.com/ja-jp/news/money/ar-AA7cspw";
	  }
	  else if(news.equals("政治家の「やらせ清掃」に批判集中、インド")){
		tv2.setText("インドで街中に捨てられているごみをなくすことなどをめざす「クリーン・インディア（Clean India）」キャンペーンがナレンドラ・モディ（Narendra Modi）首相の肝煎りで実施されている。しかし、このキャンペーンのために運の悪いある政治家が思わぬ面倒に巻き込まれてしまった。");
		tv3.setText("掃除することが大事たとえやらせでも他のごみや泥などが綺麗になる。"+"\n+非難されようが国民で続けることが大事。"+"\n"+"中国官僚も、そして我が日本の官僚・議員も見習うべき");
		link="http://www.msn.com/ja-jp/news/world/ar-AA7fswn";
	  }
	  else if(news.equals("衝突事故の羽生選手、試合出場させるべきだったのか？ 疑問の声も")){
		tv2.setText("フィギュアスケートグランプリシリーズ中国杯で演技前に中国選手と衝突して負傷した羽生結弦選手について、各方面から心配する声が多数あがった。");
		tv3.setText("選手の健康を考えないと。。。"+"\n"+"羽生次第の問題ではないかと。。。"+"\n"+"やろうじゃないか");
		link="http://www.rbbtoday.com/article/2014/11/10/125269.html";
	  }
	  else if(news.equals("早期解散の見方広がる＝消費税判断後「１９日にも」―政府・与党")){
		tv2.setText("政府・与党内で１０日、安倍晋三首相が消費税率再引き上げの先送りを判断した場合、直ちに衆院解散に踏み切るとの見方が広がった。複数の首相周辺は「今月 １９日にも解散」と言及した。これに伴う衆院選については「１２月２日公示―同１４日投開票」「１２月９日公示―同２１日投開票」との日程が取り沙汰され ている。");
		tv3.setText("10%据置、慎重論を力ずくで抑え込む作戦なんでしょうね。少なくとも自民党内で慎重論は排除出来ます。"+"\n"+"10％実現時に、軽減税率を導入しようとしていますが現場の混乱は過去最悪になるでしょう。"+"\n"+"消費税上昇分で、公務員のボーナス上昇・・・？目的と行動が一致していない。"+"\n"+"財政健全化と言うのであれば、国民全体で痛みを分かち合う精神がないと");
		link="http://www.msn.com/ja-jp/news/national/A/ar-AA7tktj";
	  }
	  if(news.equals("モスクワに「地獄の門」開く？ 悪臭たれこめ苦情殺到")){
		tv2.setText("ロシアの首都モスクワ（Moscow）で10日、悪臭が終日街に立ち込めた。当局には不安に駆られた市民からの問い合わせが殺到し、職員らは原因究明に追われた。");
		tv3.setText("問題をお隠すのはロシアはどうですかね。大変ですね"+"\n"+"可笑しいこれ"+"\n"+"宮殿がソフトクリームみたいで美味しそうなのに、余計にショックだね");
		link="http://www.msn.com/ja-jp/news/world/%E3%83%A2%E3%82%B9%E3%82%AF%E3%83%AF%E3%81%AB%E3%80%8C%E5%9C%B0%E7%8D%84%E3%81%AE%E9%96%80%E3%80%8D%E9%96%8B%E3%81%8F%EF%BC%9F-%E6%82%AA%E8%87%AD%E3%81%9F%E3%82%8C%E3%81%93%E3%82%81%E8%8B%A6%E6%83%85%E6%AE%BA%E5%88%B0/ar-AA7wVFP";
	  }
	  else if(news.equals("軍事目的オンリーの中国とはモノが違う日本の宇宙技術…")){
		tv2.setText("科学技術は「可能性」を追求し、人文科学は「実現効果を検索し企画」しますが、そこに政治の「意思」がなければ、人類の進歩に貢献する実現は達成できません");
		tv3.setText("日本の勝ちだね"+"\n"+"これから頑張らないと追い抜けられる"+"\n"+"このニュースは、なかなか");
		link="http://www.msn.com/ja-jp/news/world/%E3%80%90%E6%97%A5%E6%9C%AC%E5%8D%83%E6%80%9D%E4%B8%87%E8%80%83%E3%80%91%E8%BB%8D%E4%BA%8B%E7%9B%AE%E7%9A%84%E3%82%AA%E3%83%B3%E3%83%AA%E3%83%BC%E3%81%AE%E4%B8%AD%E5%9B%BD%E3%81%A8%E3%81%AF%E3%83%A2%E3%83%8E%E3%81%8C%E9%81%95%E3%81%86%E6%97%A5%E6%9C%AC%E3%81%AE%E5%AE%87%E5%AE%99%E6%8A%80%E8%A1%93%E2%80%A6%E3%82%AB%E3%83%BC%E3%83%8A%E3%83%93%E3%82%92%E4%B8%96%E7%95%8C%E3%81%A7%E5%88%9D%E3%82%81%E3%81%A6%E5%95%86%E5%93%81%E5%8C%96%E3%80%81%E4%B8%96%E7%95%8C%E3%81%AB%E6%89%93%E3%81%A3%E3%81%A6%E5%87%BA%E3%82%88/ar-AA7xXAu";
	  }
	  else if(news.equals("エボラ疑いの発熱、厚労省「絶対に医療機関行かないで")){
		tv2.setText("エボラ出血熱を疑われる男性が一般の医療機関を受診し、陽性ならば感染を広げる恐れがあったことを受け、厚生労働省は、検疫で流行国からの入国者に配る指示書に受診しないよう明記するなど対策を強化することを決めた。塩崎恭久厚労相が１１日の閣議後会見で明らかにした。");
		tv3.setText("行かなければ、じゃどうする"+"\n"+"人を殺す気かよ！！！"+"\n"+"エボラって恐いね");
		link="http://www.msn.com/ja-jp/news/national/%E3%82%A8%E3%83%9C%E3%83%A9%E7%96%91%E3%81%84%E3%81%AE%E7%99%BA%E7%86%B1%E3%80%81%E5%8E%9A%E5%8A%B4%E7%9C%81%E3%80%8C%E7%B5%B6%E5%AF%BE%E3%81%AB%E5%8C%BB%E7%99%82%E6%A9%9F%E9%96%A2%E8%A1%8C%E3%81%8B%E3%81%AA%E3%81%84%E3%81%A7%E3%80%8D/ar-AA7yRzs";
	  }




	  ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
	  imagebutton1.setOnClickListener(new ImageButtonClickListener1());

	  Button button1=(Button)findViewById(R.id.Campusinfo_bt);
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
		Intent intent = new Intent(NewsActivity.this , S1Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(NewsActivity.this , S3Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(NewsActivity.this , S4Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(NewsActivity.this , S5Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		if(link.equals("")){
		    Toast.makeText(NewsActivity.this, "リンクがありません！", Toast.LENGTH_SHORT).show();
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
	  getMenuInflater().inflate(R.menu.news, menu);
	  return true;
    }

}
