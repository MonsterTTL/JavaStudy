
public class Person {
	private String name ;
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
	public int getNameLength()
	{
		return name.length();
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return (name +" " +age);
	}

}
