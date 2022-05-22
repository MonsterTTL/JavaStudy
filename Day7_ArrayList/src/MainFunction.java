import java.time.LocalDate;
import java.util.ArrayList;

import equals.Employee;
import equals.Manager;

public class MainFunction {
	
	public static void main(String [] args)
	{
		ArrayList three = new ArrayList();
		
		three.add(new Employee("zzk",5200,1800,10,15));
		LocalDate show3 = ((Employee)three.get(0)).getHireDay();
		System.out.println(show3);
		
		ArrayList<Employee> one = new ArrayList();
		one.add(new Employee("Sate",1000,1999,12,1));
		one.add(new Employee("ZHoyg",2000,2000,11,1));
		System.out.println(one.get(0).getHireDay());
		Employee[] two = new Employee[one.size()];
		one.toArray(two);
		for(Employee e:one)
		{
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.getHireDay());
		}
		for(Employee e:two)
		{
			System.out.println(e.getName()+" "+e.getSalary()+" "+e.getHireDay());
		}
		
	}
	
}
