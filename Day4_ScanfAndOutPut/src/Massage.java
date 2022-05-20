public class Massage {
	public static void main(String[] arg)
	{
	if(arg[0].equals("-h"))
		System.out.println("Hello");
	else if(arg[0].equals("-g"))
		System.out.println("GoodBye! ");
	for(int i = 0;i < arg.length;i++)
		System.out.print(" "+arg[i]);
	System.out.println("!");
	}
	

}
//.min(BigInteger.valueOf(900))