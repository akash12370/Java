package MAP;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		String text = "Java is great and Java is powerfull";
		
		String[] words = text.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		for(String str : words)
		{
			str = str.toLowerCase();
			if(wordCount.containsKey(str))
			{
				wordCount.put(str, wordCount.get(str) + 1);
			}
			else
			{
				wordCount.put(str, 1);
			}
		}

		wordCount.forEach((k,v)->System.out.println(k + ":" + v));
	}

}
