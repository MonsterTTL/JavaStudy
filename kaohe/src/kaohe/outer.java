package kaohe;

public class outer {
	private String name = "Ð¡Ã÷";
	public class inner{
		String name = "Ð¡ºì";
		public void showName2()
		{
			System.out.println(this.name);
			
		}
	}
	public void ShowName1()
	{
		System.out.println(name);
		
	}

}
