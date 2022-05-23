import java.util.Scanner;

public class EnumTest {
	public static void main(String [] args)
	{
		var in = new Scanner(System.in);
		System.out.println("Enter a Size : (SMALL,MEDIUN,LARGE,EXTRAL_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("Size=" + size);
		System.out.println("Abbreviation=" + size.getAbbreviation());
		System.out.println("Price=" + size.getPrice());
		System.out.println("Location="+size.ordinal());
		if(size == Size.EXTRAL_LARGE)
		{
			System.out.println("Good Job!!");
		}
	}

}

enum Size{
	SMALL("S",100),MEDIUM("M",50),LARGE("L",150),EXTRAL_LARGE("XL",200),TOOMAX("TMAX",1000);//右边是构造器？.，初始化了abbreviation字段
	
	private String abbreviation;
	private int price;
	private Size(String abbreviation,int price) {this.abbreviation = abbreviation;this.price = price;}
	public String getAbbreviation()
	{
		return abbreviation;
	}
	public int getPrice()
	{
		return price;
	}
	
}
