package inheritance;
import java.time.*;
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name , double salary,int year,int month,int day)
	{
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void rasieSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public static int add(int a,int b)
	{
		return (a+b);
	}
	
	public static String add(String a,String b)//??̬????
	{
		return (a+b);
	}

}
