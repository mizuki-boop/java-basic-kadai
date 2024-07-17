package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
        public static void main(String[] args){
        }
//		メソッド
        public void setGivenName(){
        this.givenName = "太郎";
}
//        コンストラクタ
        public KatoTaro_Chapter18(){
        	setGivenName();
 }

//抽象メソッドの具体的な処理
//個別の紹介を出力
        public void eachIntroduce() {
        System.out.println("私はJAVAが得意です");
        }
}


