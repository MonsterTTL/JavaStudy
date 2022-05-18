
public class main {
	public static void main(String[] arg)
	{
		String show = "";
		Scanf help = new Scanf();
		System.out.println("Please enter your input.");
		show = help.getScanf();
		System.out.println(show);
		System.out.println("Again.");
		show = help.getScanf();
		System.out.println(show);
	}

}
