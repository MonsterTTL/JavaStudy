package kaohe;

public class MainFunction {
	public static void maiin(String[] args)
	{
	   Zi z = new Zi();
	}
}	
	class Fu{
		static {
			System.out.println("��̬�����Fu");
			
		}
		{
			System.out.println("��������Fu");
		}
		public Fu()
		{
			System.out.println("�幹�췽��Fu");
		}
	}
	
	class Zi extends Fu
	{
		static {
			System.out.println("��̬�����zi");
		}
		{
			System.out.println("��������zi");
		}
		public Zi()
		{
			System.out.println("�幹�췽��Zi");
		}
	}


