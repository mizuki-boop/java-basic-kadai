package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
      
//	メソッド
    public void setGivenName(){
    this.givenName = "一郎";
}
//    コンストラクタ
    public KatoIchiro_Chapter18(){
    	setGivenName();
}    

//抽象メソッドの具体的な処理
//個別の紹介を出力
        public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
        }
}


