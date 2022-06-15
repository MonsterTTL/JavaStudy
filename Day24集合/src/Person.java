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
		return "名字："+name+"年龄："+age;
	}
	
	public boolean equals(Object l)//必须重写覆盖Object的参，不然会被认定为重载
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