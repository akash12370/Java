package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> ls = List.of(1,2,3,4,5,1,2,4,5,6,3,2,3);
		
		Set<Integer> s = new HashSet<>();
		s.addAll(ls);
		
		System.out.println(s);

	}

}
