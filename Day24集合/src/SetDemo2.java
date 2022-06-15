import java.util.HashSet;

public class SetDemo2 {
	public static void main(String[] args) {
		Person one = new Person("李四",10);
		Person two = new Person("李四",10);
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		boolean flag = one.equals(two);
		
		//先比hashCode在比equals
		System.out.println(flag);
		HashSet<Person> list22 = new HashSet<Person>();
		boolean f1 = list22.add(one);
		boolean f2 = list22.add(two);
		list22.add(new Person("王五",25));
		list22.add(new Person("王五",25));
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(list22);
		
	}

}




