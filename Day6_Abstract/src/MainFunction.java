
public class MainFunction {
	public static void main(String arg[])
	{
		Person[] one = new Person[2];
		one[0] = new Student("Jerry");
		one[1] = new Employee("Tom");
		String show1;String show2;
		show1 = one[0].getDescription();
		show2 = one[1].getDescription();
		System.out.println(show1);
		System.out.println(show2);
		
		//String t1 = "haha";
		//String t2 = "haha";
		String t1 = new String("haha");
		String t2 = new String("haha");
		
		
		System.out.println(t1.equals(t2));
		
	}

}
