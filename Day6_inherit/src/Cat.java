
public class Cat extends Animal {
	public Cat() 
	{
		
	}
	public Cat(String name,int age,int height,int hight)//¹¹ÔìÆ÷
	{
		this.setName(name);
		this.setAge(age);
		this.setWeight(height);
		this.setHight(hight);
	}
	public void bark()
	{
		if(this.getAge() <= 5)
		{
			System.out.println("miaowu");
		}
		else 
		{
			System.out.println("miao");
		}
		
	}

}
