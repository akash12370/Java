import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WaysToIterate {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		
		//using iterator
		System.out.println("By using Iterator");
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//using enhanced for loop
		System.out.println("By using enhanced for loop");
		for(Integer i:l)
		{
			System.out.println(i);
		}
		
		//using lambda expression
		System.out.println("By using lambda expression");
		l.forEach(i->System.out.println(i));
		
		//using method reference
		System.out.println("By using method reference");
		l.forEach(System.out::println);

	}

}
