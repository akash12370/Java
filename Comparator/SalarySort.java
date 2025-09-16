package Comparator;

import java.util.Comparator;

public class SalarySort implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2)
	{
		return Float.compare(o1.getSalary(),o2.getSalary());
	}
	
	
}
