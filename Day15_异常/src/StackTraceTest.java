
public class StackTraceTest {
	
	public static int factorial(int n)//´òÓ¡³ö¶ÑÕ»¹ì¼£
	{
		System.out.println("factorial(" + n + "):");
		StackWalker walker = StackWalker.getInstance();
	    
		walker.forEach(a -> System.out.println(a));
		//walker.forEach(a -> System.out.println(a.getFileName()));
		int r;
		if(n <= 1) r = 1;
		else r = n * factorial(n-1);
		System.out.println("return :"+ r);
		return r;
	}

}
