
public class Per {
	private String name = null;
	private int age  = 0;
	Per(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	Per()
	{
		
	}

}

abstract class  Per_P extends Per{
	private int weight;
	private int height;
	
	Per_P()
	{
		super();
	}
	
	public void ShowName()
	{
		return ;
	}
	
	public abstract void s();
	
}