
public class outer {
	
	public static void main(String[] args)
	{
		outer one = new outer();
		one.ShowName1();
		one.ShowName2();
		
	}
	private String name = "Ð¡Ã÷";
	public class inner{
		String name = "Ð¡ºì";
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
