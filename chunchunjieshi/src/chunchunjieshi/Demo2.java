package chunchunjieshi;

public class Demo2 {
	public static void main(String[] args) {
		new Outer() .new Inner();
		
	}

}

class Outer{
	private String name = "С��";
	 class Inner{
		private String name = "С��";
		public Inner()
		{
			System.out.println(name);
			System.out.println(Outer.this.name);
		}
		
	}
}
