import java.util.ArrayList;
import java.util.Iterator;
//����--��߰�ȫ��
public class GenDemo1 {
	public static void main(String[] args) {
		ArrayList<Person> one = new ArrayList();
		one.add(new Person("ѡ��",24));
		one.add(new Person("�ܸ�",23));
		Iterator<Person> it = one.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
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
		return getName()+" |"+getAge();
	}
}
