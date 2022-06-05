
public class Person implements Comparable<Person>{
	public String name ;
	private int age ;
	
	public Person()
	{
		name = null ;
		age = 0;
	}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
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
	
	public int compareTo(Person one)
	{
		if(this.getAge() > one.getAge())
			return 1;
		else if(this.getAge() < one.getAge())
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return new String("name: "+name+" age: "+age);
	}

}
