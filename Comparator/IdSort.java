package Comparator;

import java.util.Comparator;

public class IdSort implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2)
	{
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	
}
