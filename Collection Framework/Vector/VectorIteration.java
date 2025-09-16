package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIteration {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		
		//Iteration using enumeration
		Enumeration<Integer> enm = v.elements();
		
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}

	}

}
