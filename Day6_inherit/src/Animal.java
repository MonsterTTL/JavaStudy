
public class Animal {
	private String name = "";
	private int weight = 0;
	private int hight = 0;
	private int age = 0;
	
	public Animal()
	{
		
	}
	public Animal(String name,int age,int height,int hight)
	{
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = height;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	
	public void setHight(int hight)
	{
		this.hight = hight;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void ShowInformation()
	{
		System.out.println("name: "+name);
		System.out.println("Weight: "+weight);
		System.out.println("Hight: "+hight);
		System.out.println("Age: "+age);
	}

}
