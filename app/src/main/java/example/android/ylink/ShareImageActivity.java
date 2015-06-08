package example.android.ylink;

import example.android.ylink.NewsActivity.ButtonClickListener4;
import example.android.ylink.S41Activity.ButtonClickListener1;
import example.android.ylink.S41Activity.ButtonClickListener2;
import example.android.ylink.S41Activity.ButtonClickListener3;
import example.android.ylink.S41Activity.ImageButtonClickListener1;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShareImageActivity extends Activity {

    String link="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
	  getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	  requestWindowFeature(Window.FEATURE_NO_TITLE);
	  setContentView(R.layout.share_image);

	  Intent data = getIntent();
	  Bundle extras=data.getExtras();
	  String news =extras != null ? extras.getString("SELECTED"):"";

	  TextView tv1=(TextView)findViewById(R.id.tema_text);
	  tv1.setText("テーマ：　"+news);
	  TextView tv2=(TextView)findViewById(R.id.naiyou);
	  TextView tv3=(TextView)findViewById(R.id.comment_text);
	  ImageView image = (ImageView)findViewById(R.id.Image);


	  String komoku="";


	  if(news.equals("日本国憲法ー2006")){

		komoku="過去問";
		image.setImageResource(R.drawable.kenpo);
	  }
	  else if(news.equals("基礎化学I期末試験ー2013ー栗原")){
		komoku="過去問";
		image.setImageResource(R.drawable.kisoka2013kurihara);
	  }
	  else if(news.equals("現代経済Aー2013期末ー亀卦川")){
		komoku="過去問";
		image.setImageResource(R.drawable.gendaikeizai2013kamegakekawa);
	  }
	  else if(news.equals("線形代数Ⅰー2008ー伊澤")){
		komoku="過去問";
		image.setImageResource(R.drawable.senkei2008izawa);
	  }
	  else if(news.equals("統計Ⅱー20081")){
		komoku="過去問";
		image.setImageResource(R.drawable.tokei20081);
	  }
	  else if(news.equals("統計Ⅱー20082")){
		komoku="過去問";
		image.setImageResource(R.drawable.tokei20082);
	  }
	  else if(news.equals("統計Ⅱー20083")){
		komoku="過去問";
		image.setImageResource(R.drawable.tokei20083);
	  }
	  else if(news.equals("マーケティング論1")){
		komoku="過去問";
		image.setImageResource(R.drawable.marketing1);
	  }
	  else if(news.equals("マーケティング論2")){
		komoku="過去問";
		image.setImageResource(R.drawable.marketing2);
	  }
	  else if(news.equals("国民会計論ー2007－大森")){
		komoku="過去問";
		image.setImageResource(R.drawable.kokuminkaikei2007omori);
	  }
	  else if(news.equals("計算機アーキテクチャ期末ー2012松本1")){
		komoku="過去問";
		image.setImageResource(R.drawable.architecture2012matsumoto1);
	  }
	  else if(news.equals("計算機アーキテクチャ期末ー2012松本2")){
		komoku="過去問";
		image.setImageResource(R.drawable.architecture2012matsumoto2);
	  }
	  else if(news.equals("熱力学期末ー2012後期ー野村1")){
		komoku="過去問";
		image.setImageResource(R.drawable.netsuriki2012nomura1);
	  }
	  else if(news.equals("熱力学期末ー2012後期ー野村2")){
		komoku="過去問";
		image.setImageResource(R.drawable.netsuriki2012nomura2);
	  }
	  else if(news.equals("材料力学I －H21中間試験解答")){
		komoku="過去問";
		image.setImageResource(R.drawable.zairyourikih21kaito);
	  }
	  else if(news.equals("微分積分Iー2006ー平田1")){
		komoku="過去問";
		image.setImageResource(R.drawable.bibunsekibun2006hirata1);
	  }
	  else if(news.equals("微分積分Iー2006ー平田2")){
		komoku="過去問";
		image.setImageResource(R.drawable.bibunsekibun2006hirata2);
	  }
	  else if(news.equals("微分積分Iー2006ー平田3")){
		komoku="過去問";
		image.setImageResource(R.drawable.bibunsekibun2006hirata3);
	  }
	  else if(news.equals("微分積分Iー2006ー平田4")){
		komoku="過去問";
		image.setImageResource(R.drawable.bibunsekibun2006hirata4);
	  }
	  else if(news.equals("物理学Aー2006ー鈴木")){
		komoku="過去問";
		image.setImageResource(R.drawable.butsuria2006suzuki);
	  }
	  else if(news.equals("流体力学ーH20期末1")){
		komoku="過去問";
		image.setImageResource(R.drawable.ryutaih201);
	  }
	  else if(news.equals("流体力学ーH20期末2")){
		komoku="過去問";
		image.setImageResource(R.drawable.ryutaih202);
	  }
	  else if(news.equals("生協－家庭教師")){
		komoku="バイト";
		image.setImageResource(R.drawable.a);
		tv2.setText("家庭教師はらくで、給料が高いよ＾０＾");
		link = "http://www.univcoop.jp/ynu/info/job.html#s01";
	  }
	  else if(news.equals("セブンイレブン－横浜保土ヶ谷公園前店")){
		komoku="バイト";
		image.setImageResource(R.drawable.b);
		tv2.setText("学校からちょっと遠いけど、給料が高い！");
		link = "http://townwork.net/detail/clc_3196779002/joid_17975192/";
	  }
	  else if(news.equals("ちよだ鮨(A)スマイルストリート瀬谷店(B)和田町駅前店")){
		komoku="バイト";
		image.setImageResource(R.drawable.c);
		tv2.setText("お寿司が好きな人！募集中！");
		link = "http://townwork.net/detail/clc_0128134292/";
	  }
	  else if(news.equals("笑笑－和田町南口駅前店")){
		komoku="バイト";
		image.setImageResource(R.drawable.d);
		tv2.setText("シフト制だから予定に合わせれるよ＾＾");
		link = "http://townwork.net/detail/clc_2634792017/joid_95070797/";
	  }
	  else if(news.equals("ガスト－10店舗合同募集")){
		komoku="バイト";
		image.setImageResource(R.drawable.e);
		tv2.setText("ファミレスで働きません？未経験者でも最初からキチンと教える！");
		link = "http://townwork.net/detail/clc_0276473072/";
	  }
	  else if(news.equals("セブンイレブン－星川西店")){
		komoku="バイト";
		image.setImageResource(R.drawable.g);
		tv2.setText("星川駅周辺の人！セブンイレブンで働かない?");
		link = "http://townwork.net/detail/clc_2976591667/joid_95182989/";
	  }
	  else if(news.equals("グラッチェガーデンズ－三ツ沢店")){
		komoku="バイト";
		image.setImageResource(R.drawable.h);
		tv2.setText("三ッ沢上町から徒歩4分だけだよ！！！");
		link ="http://townwork.net/detail/clc_0276473705/joid_94895845/";
	  }
	  else if(news.equals("ジョナサン－横浜鶴屋町店")){
		komoku="バイト";
		image.setImageResource(R.drawable.i);
		tv2.setText("ジョナサンは給料アップして950円からだよ！高い！");
		link ="http://townwork.net/detail/clc_3065926536/joid_94899522/";
	  }
	  else if(news.equals("ガスト－星川駅前店")){
		komoku="バイト";
		image.setImageResource(R.drawable.k);
		tv2.setText("はい！星川駅から徒歩1分＾＾便利！！！");
		link ="http://townwork.net/detail/clc_2290000303/joid_94896546/";
	  }
	  else if(news.equals("バーミヤン－星川駅前店")){
		komoku="バイト";
		image.setImageResource(R.drawable.l);
		tv2.setText("バーミヤンで働かない？未経験者でも大丈夫だよ！");
		link = "http://townwork.net/detail/clc_0276473823/joid_94894151/";
	  }
	  else if(news.equals("ジョナサン－上星川店")){
		komoku="バイト";
		image.setImageResource(R.drawable.m);
		tv2.setText("上星川駅のすぐ隣のジョナサンでお金を稼ごう！");
		link = "http://townwork.net/detail/clc_3065926364/joid_94899776/";
	  }
	  else if(news.equals("セブンイレブン－横浜峰沢町店")){
		komoku="バイト";
		image.setImageResource(R.drawable.n);
		tv2.setText("三ッ沢上町の人、7イレブンがスタフを募集してるよ！");
		link ="http://townwork.net/detail/clc_2976591667/joid_94231539/";
	  }
	  else if(news.equals("銀のさら・釜寅 横浜星川店")){
		komoku="バイト";
		image.setImageResource(R.drawable.o);
		tv2.setText("週1日でもおけだよ！");
		link ="http://townwork.net/detail/clc_1958986205/joid_94903009/";
	  }
	  else if(news.equals("サークルK－釜台町店")){
		komoku="バイト";
		image.setImageResource(R.drawable.p);
		tv2.setText("キャンパスの西門にあるよ！サークルKで働こう＾＾");
		link = "http://townwork.net/detail/clc_2579199654/joid_95152164/";
	  }
	  else if(news.equals("焼メシ＆焼スパ金太郎－太洋観光株式会社")){
		komoku="バイト";
		image.setImageResource(R.drawable.q);
		tv2.setText("金太郎で働きませんか？横浜駅にある！");
		link ="http://townwork.net/detail/clc_0301505030/";
	  }
	  else if(news.equals("JASSO支援金 （自然災害被災者対象）")){
		komoku="奨学金";
		image.setImageResource(R.drawable.jasso);
	  }
	  else if(news.equals("ＪＴアジア奨学金")){
		komoku="奨学金";
		image.setImageResource(R.drawable.jt);
	  }
	  else if(news.equals("ヤマハ音楽支援制度")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yamaha);
	  }
	  else if(news.equals("ヨネックススポーツ振興財団")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yonex);
	  }
	  else if(news.equals("公益財団法人似鳥国際奨学財団")){
		komoku="奨学金";
		image.setImageResource(R.drawable.nitori);
	  }
	  else if(news.equals("川嶋章司記念スカラーシップ基金")){
		komoku="奨学金";
		image.setImageResource(R.drawable.kawasima);
	  }
	  else if(news.equals("本庄国際奨学財団奨学金")){
		komoku="奨学金";
		image.setImageResource(R.drawable.honjo);
	  }
	  else if(news.equals("留山田長満奨学生")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yamada);
	  }
	  else if(news.equals("JASSO支援金（自然災害被災者対象)")){
		komoku="奨学金";
		image.setImageResource(R.drawable.jasso2);
	  }
	  else if(news.equals("ヤマハ音楽支援制度")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yamaha2);
	  }
	  else if(news.equals("ヨネックス・スポーツ振興財団")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yonex2);
	  }
	  else if(news.equals("交通遺児育英会")){
		komoku="奨学金";
		image.setImageResource(R.drawable.koutsu2);
	  }
	  else if(news.equals("山田長満奨学生")){
		komoku="奨学金";
		image.setImageResource(R.drawable.yamada2);
	  }
	  else if(news.equals("石川県育英資金（緊急採用）")){
		komoku="奨学金";
		image.setImageResource(R.drawable.isikawa2);
	  }
	  else if(news.equals("本庄国際奨学財団")){
		komoku="奨学金";
		image.setImageResource(R.drawable.honjo2);
	  }
	  else if(news.equals("ＢＲＩＣＫＳ 101【相鉄本線 和田町駅 徒歩5分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.bricks);
	  }
	  else if(news.equals("Ｍ ｇｒａｎｄｅｕｒ【相鉄本線 和田町駅 徒歩7分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.mgrandeur);
	  }
	  else if(news.equals("ウィステリア三ツ沢【横浜市営地下鉄ブルーライン 三ツ沢上町駅 徒歩7分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.wisteria);
	  }
	  else if(news.equals("ウエストウイングII 201【相鉄本線 上星川駅 徒歩11分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.westwing);
	  }
	  else if(news.equals("グリシーナ・ステラ 203【横浜市営地下鉄ブルーライン 三ツ沢上町駅 徒歩10分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.gurisina);
	  }
	  else if(news.equals("サンヒルズ上星川 102【相鉄本線 上星川駅 徒歩3分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.sanhiruzu);
	  }
	  else if(news.equals("トライヒルズ2 104【相鉄本線 和田町駅 徒歩3分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.toraihiruzu);
	  }
	  else if(news.equals("ドリームコート上星川Ａ棟 2D【相鉄本線 上星川駅 徒歩3分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.dorimukoto);
	  }
	  else if(news.equals("トレビアーノの調べ【相鉄本線 上星川駅 徒歩3分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.torebiano);
	  }
	  else if(news.equals("ノワール三ッ沢【横浜市営地下鉄ブルーライン 三ツ沢上町駅 徒歩7分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.nowaru);
	  }
	  else if(news.equals("フォレストパーク上星川II 102【相鉄本線 上星川駅 徒歩6分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.foresutopaku);
	  }
	  else if(news.equals("ユナイト和田町ロートレック・オペラ 101【相鉄本線 和田町駅 徒歩2分】")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.konaito);
	  }
	  else if(news.equals("横浜市営地下鉄ブルーライン 三ツ沢上町駅 徒歩7分")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.bururain);
	  }
	  else if(news.equals("相鉄本線 和田町駅 徒歩3分")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.wadamachi3m);
	  }
	  else if(news.equals("相鉄本線 和田町駅 徒歩5分")){
		komoku="部屋探し";
		image.setImageResource(R.drawable.wadamachi5m);
	  }
	  else if(news.equals("寮での留学生向けのParty")){
		tv2.setText("今日横国大の寮で17時から留学生向けのPartyがあるので、皆さんは参加しましょうか^^");
		komoku="その他";
		image.setImageResource(R.drawable.kaikan);
	  }
	  else if(news.equals("入学料・学費免除の種類提出の締め切り")){
		tv2.setText("皆さん、今日は入学料・学費免除の種類提出の締め切りの日なので、忘れないように気をつけてくださいね！");
		komoku="その他";
		image.setImageResource(R.drawable.tuition);
	  }
	  else if(news.equals("就活説明会についてのお知らせ")){
		tv2.setText("来週の月曜日に大学ホールで東芝株式会社の就活説明会を行うことになるんです。興味を持っている方、東芝会社で働きたい希望がある方はいかがでしょうか？");
		komoku="その他";
		image.setImageResource(R.drawable.syukatsu);
	  }
	  else if(news.equals("横国大での日本人の学生と留学生とのサッカー交流大会")){
		tv2.setText("来週の日曜日に学校の運動場で16時から横国大での日本人の学生と留学生とのサッカー交流大会があるんです。");
		komoku="その他";
		image.setImageResource(R.drawable.sport);
	  }
	  else if(news.equals("嵐グループが横国大に来る")){
		tv2.setText("今度の12月の15日に嵐グループが横国大に来るようです");
		komoku="その他";
		image.setImageResource(R.drawable.vannghe);

	  }
	  else if(news.equals("英語を練習したい方はこちらにどうぞ")){
		tv2.setText("英会話クラブ英語力アップをはじめ、皆が交流出来るところという目的で、毎週の木曜日に12時から13時まで学生センターの一階で英会話クラブのメンバーが集まって、英語でしゃべったり、交流したり、します。皆さんはどうでしょうか？");
		komoku="その他";
		image.setImageResource(R.drawable.eclub);

	  }
	  else if(news.equals("生協でのBig sale")){
		tv2.setText("これから生協でのBig saleがあると聞きました。");
		komoku="その他";
		image.setImageResource(R.drawable.seikyo);

	  }
	  else if(news.equals("学内での国際交流文芸")){
		tv2.setText("今日は学内の食堂1で行う国際交流文芸があるんだよ！行きたくて、だれか一緒に行けませんか？");
		komoku="その他";
		image.setImageResource(R.drawable.internationalmeeting);

	  }
	  else if(news.equals("日本語を練習したい留学生はこちらにどうぞ")){
		tv2.setText("日本人の学生はボランティアとして留学生の皆に日本語を教えることを通じて留学生が日本文化をよく理解し、日本の生活を速く溶け込むように手伝う");
		komoku="その他";
		image.setImageResource(R.drawable.japaneseclub);

	  }
	  else if(news.equals("食堂での特別なメニューの最後の日")){
		tv2.setText("大盛りの無料のラーメンは今日だけで、明日からもう終わりだよ、皆さん、早く食堂に行こう！！！");
		komoku="その他";
		image.setImageResource(R.drawable.cafeteria);

	  }
	  else if(news.equals("横国大でのテニス大会")){
		tv2.setText("来週の土曜日に学内の体育館で10時からテニス大会があるんです。");
		komoku="その他";
		image.setImageResource(R.drawable.sportcenter);

	  }
	  else if(news.equals("海外での交流プログラムの募集について")){
		tv2.setText("本学に在籍する学生で英語によるコミュニケーション及び文章作成が可能な者はもし希望があったら、募集期間内に（2014年11月20日午後5時まで）メールに必要書類を添付して、abc@ynu.ac.jpへ送付してください");
		komoku="その他";
		image.setImageResource(R.drawable.studyabroad);
	  }
	  else if(news.equals("この間、忘れ物がある方")){
		tv2.setText("この間、生産棟の周辺に携帯電話を拾って、学生センターに渡しましたので、こちらにお知らせいてします。");
		komoku="その他";
		image.setImageResource(R.drawable.lostthing);

	  }
	  else if(news.equals("学内での学生の交流会")){
		tv2.setText("明日の17時半から、学内の食堂1で行う学生の交流会があるんだよ！皆さん、行こうか？");
		komoku="その他";
		image.setImageResource(R.drawable.ketnoibb);

	  }
	  else if(news.equals("冷蔵庫がいる方")){
		tv2.setText("遠い所に引っ越しますから、今使っている冷蔵庫はもう使わない。だれかいりますか？まだ新いです。^^");
		komoku="その他";
		image.setImageResource(R.drawable.secondhand);

	  }

	  if(komoku.equals("過去問")){
		tv2.setText("いつも過去問をもらってばかりいるので、"+"\n"+
			  "今日自分からも持っている過去問をシェアしまーす＾＾"+"\n"+
			  "どうぞ、ご自由にダウンロードして参考してください");
		tv3.setText("ありがとう"+"\n"+"いいね！"+"\n"+"助かります！");
	  }
	  else if(komoku.equals("バイト")){
		tv3.setText("ありがとう！"+"\n"+"サンキュー＾＾");
	  }
	  else if(komoku.equals("奨学金")){
		tv2.setText("気付かないうちに、奨学金が数多く増えている！シェアしないともったいなくなっちゃうから＾＾");
		tv3.setText("いいね");
	  }
	  else if(komoku.equals("部屋探し")){
		tv2.setText("来年度の春学期から部屋を探す人が多分少なくないから自分が今持っている情報をシェアする＾＾");
		tv3.setText("ありがとう");
	  }
	  else if(komoku.equals("その他")){
		tv3.setText("色々あるね＾＾"+"/n"+"ありがとう");
	  }


	  ImageButton imagebutton1=(ImageButton)findViewById(R.id.banner);
	  imagebutton1.setOnClickListener(new ImageButtonClickListener1());

	  Button button1=(Button)findViewById(R.id.Campusinfo_bt);
	  button1.setOnClickListener(new ButtonClickListener1());

	  Button button2=(Button)findViewById(R.id.News_bt);
	  button2.setOnClickListener(new ButtonClickListener2());

	  Button button3=(Button)findViewById(R.id.Link_bt);
	  button3.setOnClickListener(new ButtonClickListener3());

	  Button button4=(Button)findViewById(R.id.readlink_bt);
	  button4.setOnClickListener(new ButtonClickListener4());

    }

    class ImageButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(ShareImageActivity.this , S1Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener1 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(ShareImageActivity.this , S3Activity.class);
		startActivity(intent);
	  }
    }

    class ButtonClickListener2 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(ShareImageActivity.this , S2Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener3 implements OnClickListener{
	  public void onClick(View v){
		Intent intent = new Intent(ShareImageActivity.this , S5Activity.class);
		startActivity(intent);

	  }
    }

    class ButtonClickListener4 implements OnClickListener{
	  public void onClick(View v){
		if(link.equals("")){
		    Toast.makeText(ShareImageActivity.this, "リンクがありません！", Toast.LENGTH_SHORT).show();
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
	  getMenuInflater().inflate(R.menu.share_image, menu);
	  return true;
    }

}
