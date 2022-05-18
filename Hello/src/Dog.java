
public class Dog {
	private String name = null;
	private int Age = 0;
	public void Bark()
	{
		if(Age > 10)
		{
			System.out.println("aohu~~");
		}
		else
		{
			System.out.println("bark!");
		}
	}
	
	public void setAge(int nage)
	{
		Age = nage;
	}
	
	public void setname(String nename)
	{
		name = nename;
	}
	
	public void Showname()
	{
		System.out.println(name);
	}
	

}
