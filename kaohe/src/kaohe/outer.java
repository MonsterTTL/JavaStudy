package kaohe;

public class outer {
	private String name = "С��";
	public class inner{
		String name = "С��";
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
