package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
		public static void fruitdict(){
	        HashMap<String, String> map = new HashMap<>();
	        
			map.put("apple","りんご");
			map.put("peach", "桃");
			map.put("banana", "バナナ");
			map.put("lemon", "レモン");
			map.put("pear", "梨");
			map.put("kiwi", "キウィ");
			map.put("strawberry", "いちご");
			map.put("grape", "ぶどう");
			map.put("muscat", "マスカット");
			map.put("cherry", "さくらんぼ");
			
			String targetWord[]= new String[4];
			targetWord[0]="apple";
			targetWord[1]="banana";
			targetWord[2]="grape";
			targetWord[3]="orange";
			
			
				
			for(String word: targetWord) {
				boolean exist=map.containsKey(word);
				 if(exist) {
			        System.out.println(word + "の意味は" + map.get(word));
			    } else {
			        System.out.println(word + "は辞書に存在しません");
			    }
			}
}
}