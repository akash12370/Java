package Vector;

import java.util.Vector;

public class NumberVector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(-10);
		v.add(-845);
		v.add(412);
		v.add(0);
		v.add(14);
		
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i)<0)
			{
				System.out.println(v.get(i) + " is negative");
			}
			else if (v.get(i)>0)
			{
				System.out.println(v.get(i) + " is positive");
			}
			else
			{
				System.out.println(v.get(i) + " is zero");
			}
		}

	}

}
