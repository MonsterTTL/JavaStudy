
public class outer {
	
	public static void main(String[] args)
	{
		outer one = new outer();
		one.ShowName1();
		one.ShowName2();
		
	}
	private String name = "С��";
	public class inner{
		String name = "С��";
		public void ShowName2()
		{
			System.out.println(this.name);
			System.out.println();
		}
	}
	inner two = new inner();
	public void ShowName1()
	{
		System.out.println(name);
	}
    public void ShowName2()
    {
    	two.ShowName2();
    }
}
