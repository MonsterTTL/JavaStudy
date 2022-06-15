public class Person{
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
	
	public boolean equals(Object l)//������д����Object�ĲΣ���Ȼ�ᱻ�϶�Ϊ����
	{	
		Person o = (Person)l;
		return name.equals(o.getName())&&age == o.getAge();
	}
	
	public int hashCode()
	{
		return age;
		//return 10;
	}
	
}