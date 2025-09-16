package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(100);
		q.add(200);
		q.add(300);
		q.add(400);
		q.add(250);
		q.add(190);
		
		q.poll(); //pop method - remove first element
//		System.out.println(q.peek());  //return first element
		System.out.println("Array Deque:" + q);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}

	}

}
