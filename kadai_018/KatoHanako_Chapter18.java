package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
      
//		メソッド
        public void setGivenName(){
        this.givenName = "花子";
}
//        コンストラクタ
        public KatoHanako_Chapter18(){
        	setGivenName();
 }

        
//抽象メソッドの具体的な処理
//個別の紹介を出力
        public void eachIntroduce() {
        System.out.println("趣味は読書です");
        }
        }
        




