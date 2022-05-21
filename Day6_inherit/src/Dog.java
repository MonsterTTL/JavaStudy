
public class Dog extends Animal {
//	public Dog() 
//	{
//		
//	}
//	public Dog(String name,int age,int height,int hight)//¹¹ÔìÆ÷
//	{
//		this.setName(name);
//		this.setAge(age);
//		this.setWeight(height);
//		this.setHight(hight);
//	}
	public Dog()
	{
		super();
	}
	
	public Dog(String name,int age,int height,int hight)
	{
		super(name,age,height,hight);
	}
	public void bark()
	{
		if(this.getAge() <= 5)
		{
			System.out.println("Wolf!");
		}
		else if(this.getAge() <= 10)
		{
			System.out.println("Aowu~");
		}
		else
		{
			System.out.println("Rua!");
		}
	}


}
