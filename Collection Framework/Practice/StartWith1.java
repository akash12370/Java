package Practice;

import java.util.ArrayList;
import java.util.List;

public class StartWith1 {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1,201,1101,7511,103);
		List<Integer> result = new ArrayList<>();
		
		for(Integer i:ls)
		{
			if(String.valueOf(i).startsWith("1"))
			{
				result.add(i);
			}
		}
		
		System.out.println(result);

	}

}
