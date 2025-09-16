package MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccerenceOfLetter {

	public static void main(String[] args) {
		String str = "This is Java";
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		
		for(Character ch : str.toCharArray())
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		charMap.forEach((k,v)->System.out.println(k + " " + v));

	}

}
