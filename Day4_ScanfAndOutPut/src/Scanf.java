import java.util.Scanner;

public class Scanf {
	
//	public static void main(String[] arg)
//	{Scanner in = new Scanner(System.in);
//	 System.out.println("Who's Your Dady?");
//	 String name = in.nextLine();
//	 System.out.println("Sorry , Your Father is not "+name + " . But me!");
//	}
	
  Scanner in = new Scanner(System.in);
  String ret = "";
  public String getScanf()
  {
	  
	  ret = in.nextLine();
	  return ret;
  }
}
