import java.util.HashSet;

public class SetDemo2 {
	public static void main(String[] args) {
		Person one = new Person("李四",10);
		Person two = new Person("李四",10);
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		boolean flag = one.equals(two);
		System.out.println(flag);
		HashSet<Person> list = new HashSet<>();
		boolean f1 = list.add(one);
		boolean f2 = list.add(two);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(list);
		
	}

}


