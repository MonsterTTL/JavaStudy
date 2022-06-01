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
			e.initCause(new Throwable("Error!"));//Ϊ�쳣e����ԭ��
			System.out.println(e.getCause().toString());//��ӡ��e��ԭ��
			
			System.out.println("Sorry!");
			throw new InputMismatchException("������Ϣ���Ͳ�ƥ��");//�ٴ��׳��쳣����������Ϣ
		 }
		 catch(AssertionError c)
		 {
			 throw new AssertionError(c);
		 }
	    }catch(InputMismatchException d)
		 {
	    	System.out.println(d.getMessage());//��ӡ�����ӵ���Ϣ
			
		 }
	    catch(AssertionError e)
		 {
	    	System.out.println(e.getMessage());
		 }
	}

}
