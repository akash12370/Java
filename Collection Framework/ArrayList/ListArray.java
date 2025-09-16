package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListArray {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
//		l.add(100);
//		l.add(200);
//		l.add(300);
//		l.add(400);
//		l.add(500);
//		l.add(400);
//		
//		l.remove(3);
//		System.out.println(l);
		
//		Iterator<Integer> itr = l.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		for(Integer i:l)
//		{
//			System.out.println(i);
//		}

		Scanner s = new Scanner(System.in);
		
//		for(int i = 0;i<=5;i++)
//		{
//			
//			System.out.println("Enter value:");
//			int m = s.nextInt();
//			
//			l.add(m);
//		}
//		System.out.println(l);
		
//		boolean temp = true;
//		while(temp)
//		{
//			System.out.println("Enter 1 to start and 2 to end");
//			int ch = s.nextInt();
//		switch(ch)
//		{
//		case 1:
//			System.out.println("Enter value:");
//			int m = s.nextInt();
//			l.add(m);
//			break;
//			
//		case 2:
//			temp = false;
//			break;
//			
//		case 3:
//			System.out.println(l);
//			temp = false;
//			break;
//		}
//		}
//		boolean temp = true;
		
		while(true)
		{
			System.out.println("Enter 1 to start and 2 to end and 3 to print and end");
			int ch = s.nextInt();
			
			if(ch==1)
			{
				System.out.println("Enter value:");
				int m = s.nextInt();
				l.add(m);
				
			}
			else if(ch==2)
			{
				
				break;
			}
			else if(ch==3)
			{
				System.out.println(l);
				break;
				
			}
		}
		
		
		
		
	}

}
