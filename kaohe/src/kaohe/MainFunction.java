package kaohe;

public class MainFunction {
	public static void maiin(String[] args)
	{
	   Zi z = new Zi();
	}
}	
	class Fu{
		static {
			System.out.println("静态代码块Fu");
			
		}
		{
			System.out.println("构造代码块Fu");
		}
		public Fu()
		{
			System.out.println("五构造方法Fu");
		}
	}
	
	class Zi extends Fu
	{
		static {
			System.out.println("静态代码块zi");
		}
		{
			System.out.println("构造代码块zi");
		}
		public Zi()
		{
			System.out.println("五构造方法Zi");
		}
	}


