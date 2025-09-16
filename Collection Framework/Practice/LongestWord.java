package Practice;

import java.util.List;

public class LongestWord {

	public static void main(String[] args) {
		List<String> ls = List.of("Apple","Banana","Coconut","Watermelon","Orange");
		
		String longest = "";
		
		for(String word : ls)
		{
			if(word.length() > longest.length())
			{
				longest = word;
			}
		}

		System.out.println("Longest Word:" + longest);
	}

}
