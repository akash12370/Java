package MAP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MApIteration {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<>();
		m.put(101, "Raju");
		m.put(102,"Shaam");
		m.put(103, "Babu Bhaiyya");
		m.put(104, "Pandu");
		m.put(111, "Temp");
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("Akash"));
		m.remove(111);
//		m.clear(); to delete all entries from map
		
		
		Set<Integer> s = m.keySet();
		
		for(Integer k:s)
		{
			System.out.println("Key:" + k + " Value:" + m.get(k));
		}
		
		System.out.println("By using lamba expression");
		m.forEach((k,v)->System.out.println("Keys:" + k + " Value:" + v));
	}

}
