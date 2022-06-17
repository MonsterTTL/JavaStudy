import java.util.LinkedHashSet;
import java.util.Objects;
//LinkedHashSet
//1.��ȡ����
//2.���ظ�
//�ײ�������ʵ�֣���Set������Ψһ��ȡ�����

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
		return "���֣�"+name+"���䣺"+age;
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
	
//	public boolean equals(Object l)//������д����Object�ĲΣ���Ȼ�ᱻ�϶�Ϊ����
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