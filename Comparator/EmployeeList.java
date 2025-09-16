package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Spiderman",8000);
		Employee e2 = new Employee(105,"Ironman",7000);
		Employee e3 = new Employee(102,"Batman",9000);
		Employee e4 = new Employee(103,"WonderWoman",5000);
		Employee e5 = new Employee(104,"Thor",8900);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
//for sorting using IdSort file
//		IdSort is = new IdSort();
//		SalarySort ss = new SalarySort();
		
		
//for sorting without extra file
		//using id
//		Comparator<Employee> is = new Comparator<Employee>() {
//			public int compare(Employee o1, Employee o2)
//			{
//				return Integer.compare(o1.getId(), o2.getId());
//			}
//		};
		
		//using name
//		Comparator<Employee> ns = new Comparator<Employee>() {
//			public int compare(Employee o1, Employee o2)
//			{
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
		
		
		//more compact code for id sort
		Comparator<Employee> is = (Employee o1,Employee o2) -> {
			return Integer.compare(o1.getId(), o2.getId());
		};
		
		//more compact code for name sort
				Comparator<Employee> ns = (o1,o2) -> {
					return o1.getName().compareTo(o2.getName());
				};
		
		
		Collections.sort(empList,ns);
		
		//for each loop
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
	}

}
