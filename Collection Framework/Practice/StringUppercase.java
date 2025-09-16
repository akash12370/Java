package Practice;

import java.util.List;

public class StringUppercase {

	public static void main(String[] args) {
		List<String> ls = List.of("abc","def","ghi","jkl");
		
		for(String str:ls)
		{
			System.out.println(str.toUpperCase());
		}

	}

}
