import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainFunction {
	public static void main(String[] args)
	{
		//Logger.getGlobal().setLevel(Level.OFF);//关闭全局日志显示
	 try{
		try(Scanner in = new Scanner(System.in))
		{
			System.out.print("Enter n: ");
			int n = in.nextInt();
			assert (n <= 8) : "n > 8!";
			Logger.getGlobal().info("File -> Open menu item selected");//打印出一个日志
			StackTraceTest.factorial(n);
		}
		catch(InputMismatchException e)
		 {
			System.out.println(e.getMessage());
			e.initCause(new Throwable("Error!"));//为异常e设置原因
			System.out.println(e.getCause().toString());//打印出e的原因
			
			System.out.println("Sorry!");
			Logger.getLogger("ayichang").log(Level.WARNING,"Message Error",e);
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
