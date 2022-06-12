package chunchunjieshi;

public class Demo2 {
	public static void main(String[] args) {
		new Outer() .new Inner();
		
	}

}

class Outer{
	private String name = "Ð¡Ã÷";
	 class Inner{
		private String name = "Ð¡ºì";
		public Inner()
		{
			System.out.println(name);
			System.out.println(Outer.this.name);
		}
		
	}
}
