package equals;
public class EqualTest {
	public static void main(String [] args)
	{
		var alice1 = new Employee("Alice Adams",75000,1987,12,15);
		var alice2 = alice1;
		var alice3 = new Employee("Alice Adams",75000,1987,12,15);
		var bob =  new Employee("Bob Brandson",50000,1989,10,1);
		
		System.out.println("alice1 == alice2: "+(alice1 == alice2));//查的地址
		System.out.println("alice1 == alice3: "+(alice1 == alice3));
		
		System.out.println("alice1.equals(alice3): "+alice1.equals(alice3));
		
		System.out.println("alice1.equals(bob): "+alice1.equals(bob));
		
		System.out.println("bob.toString(): "+bob);
		
		var carl = new Manager("Cral Cracker",80000,1987,12,15);
		var boss = new Manager("Cral Cracker",80000,1987,12,15);
		boss.setBonus(5000);
		System.out.println("boss.toString(): "+boss);
		System.out.println("carl.equals(boss): "+carl.equals(boss));//bonus不同
		System.out.println("alice1.hashCode(): "+alice1.hashCode());
		System.out.println("alice3.hashCode(): "+alice3.hashCode());//alice1 和 alice3 内容完全相同,所以哈希码也一样
		System.out.println("bob.hashCode(): "+bob.hashCode());
		System.out.println("Carl.hashCode(): "+carl.hashCode());


	}

}
