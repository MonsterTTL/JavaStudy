
public class Demo2_Exp {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try {
			System.out.println(a / b);
			System.out.println(arr[10]);
			arr = null;
			System.out.println(arr[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("除数不能为零");//可以加个|，可以处理多个异常（ArithmeticException|ArrayIndexOutOfBoundsException e）
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		}catch(Exception e)
		{
		System.out.println("出错了");
		}
		finally {
			
		}
		
	}

}
