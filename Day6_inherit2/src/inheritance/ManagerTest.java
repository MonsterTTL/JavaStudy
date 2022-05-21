package inheritance;
public class ManagerTest {
	public static void main(String arg[])
	{
		var boss = new Manager("Carl Cracker",80000,1987,12,15);
		boss.setBonus(5000);
		
		
		var staff = new Employee[3];
		
		int test = Employee.add(3, 4);
		String t1 = Employee.add("Hello ", "World!");
		System.out.println(test);
		System.out.println(t1);
		
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee("Tommy Tester",40000,1990,3,5);
		
		for(Employee e:staff)
		{
			System.out.println("Name: "+e.getName() +",salary: "+e.getSalary()+",hireDay: "+e.getHireDay());
		}
		
		if(staff[1] instanceof Manager)
		  boss= (Manager) staff[1];
		
	}
			

}
