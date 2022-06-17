import java.util.LinkedHashSet;
import java.util.Objects;
//LinkedHashSet
//1.存取有序
//2.无重复
//底层是链表实现，是Set集合中唯一存取有序的

public class Demo1 {
	public static void main(String[] args) {
		LinkedHashSet<String> one = new LinkedHashSet<>();
		one.add("a");
		one.add("b");
		one.add("c");
		for (String string : one) {
			System.out.println(string);
		}
		
	}

}

class Person{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return "名字："+name+"年龄："+age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
//	public boolean equals(Object l)//必须重写覆盖Object的参，不然会被认定为重载
//	{	
//		Person o = (Person)l;
//		return name.equals(o.getName())&&age == o.getAge();
//	}
//	
//	public int hashCode()
//	{
//		return age;
//		//return 10;
//	}
	
}