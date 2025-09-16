package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(500);
		hs.add(400);
		hs.add(null);
		System.out.println("Hashset:" + hs);
		
		Set<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(100);
		ls.add(200);
		ls.add(400);
		ls.add(700);
		ls.add(900);
		System.out.println("Linked Hashset:" + ls);
		
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(23);
		ts.add(21);
		ts.add(10);
		ts.add(14);
		ts.add(55);
		System.out.println("Treeset:" + ts);
		
	}

}
