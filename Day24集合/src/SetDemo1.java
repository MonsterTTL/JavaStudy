import java.util.HashSet;

public class SetDemo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //Set��û���ظ�Ԫ��
		boolean f1 = hs.add("a");	//Set���������������ظ�����ȡ��һ��
		boolean f2 = hs.add("b");  //�洢�ظ�Ԫ��ʱ����false
		hs.add("c");				//û����дtoString,�����̳��˸������д�˵�toString
		hs.add("d");
		hs.add("e");
		hs.add("f");
		System.out.println(f1);
		System.out.println(f2);  
		System.out.println(hs);
		for (String string : hs) {
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
	
	public boolean equals(Person o)
	{
		return name.equals(o.getName())&&age == o.getAge();
	}
	
	public int hashCode()
	{
		return name.hashCode()+age;
		//return 10;
	}
	
}
