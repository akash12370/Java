package Vector;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(100);
		s.add(200);
		s.push(300);
		s.add(400);
		s.push(500);
		s.add(600);
		
		System.out.println(s.peek());
		
		//Iteration using pop method for stack
		System.out.println("Iteration using pop method for stack");
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}

	}

}
