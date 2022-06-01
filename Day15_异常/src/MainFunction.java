import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args)
	{
	 try{
		try(Scanner in = new Scanner(System.in))
		{
			System.out.print("Enter n: ");
			int n = in.nextInt();
			assert (n <= 8) : "n > 8!";
			StackTraceTest.factorial(n);
		}
		catch(InputMismatchException e)
		 {
			System.out.println(e.getMessage());
			e.initCause(new Throwable("Error!"));//为异常e设置原因
			System.out.println(e.getCause().toString());//打印出e的原因
			
			System.out.println("Sorry!");
			throw new InputMismatchException("输入信息类型不匹配");//再次抛出异常，并附加信息
		 }
		 catch(AssertionError c)
		 {
			 throw new AssertionError(c);
		 }
	    }catch(InputMismatchException d)
		 {
	    	System.out.println(d.getMessage());//打印出附加的信息
			
		 }
	    catch(AssertionError e)
		 {
	    	System.out.println(e.getMessage());
		 }
	}

}
