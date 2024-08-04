package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	

	//　自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		Scanner scanner= new Scanner(System.in);
			String myinput=scanner.next();
			
			if(myinput.equals("r")||myinput.equals("s")||myinput.equals("p")) {
				scanner.close();
				return myinput;
			}else {
				System.out.println("じゃんけんの手ではありません。再入力してください。");
				return getMyChoice();
			}

	}
	
	
//　対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] rspArray= {"r", "s", "p"}; 
		String yourinput=rspArray[(int) Math.floor(Math.random()*3)];
		return yourinput;
	}
	
	
// じゃんけんを行うメソッド
	public void playGame() {
		
//コレクションの作成
		HashMap<String,String> rspMap = new HashMap<String,String>();
	      rspMap.put("r","グー");
	      rspMap.put("s","チョキ");
	      rspMap.put("p","パー");
			
//自分と対戦相手のじゃんけんの手を出力する
	      String me=new String(getMyChoice());
	      String you=new String(getRandom());
	      
System.out.println("自分の手は" +rspMap.get(me)+",対戦相手の手は" + rspMap.get(you));
	      
//equals()メソッドで自分と対戦相手のじゃんけんの手を比較する	      
	      if(me.equals(you)) {
	         System.out.println("あいこです");
	      } else if((me.equals("r")&&you.equals("s"))||
	    		  	(me.equals("s")&&you.equals("p"))||
	    		  	(me.equals("p")&&you.equals("r"))){
	    	  System.out.println("自分の勝ちです");
	      } else{
	    	  System.out.println("自分の負けです");
	      }
	      
	
	}

}
