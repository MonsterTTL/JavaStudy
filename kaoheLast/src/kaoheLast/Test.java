package kaoheLast;

public class Test {
	public static void main(String[] args)
	{
		Outer.method().show();
	}
	
}	
interface Inner{
		void show();
	}	
class Outer implements Inner{
		private String name = "jjj";
		
		public static Outer method()
		{ 
			return new Outer();
		}
		public void show()
		{
			System.out.println(name);
		}
		
}


