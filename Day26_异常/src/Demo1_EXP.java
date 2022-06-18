// try:检测异常
// catch:捕获异常
// finally:释放资源
public class Demo1_EXP {
	public static void main(String[] args) {
		try {
			int c = Tool.div(10, 0);
			System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println("出错了，除数不能为零");
		}
		finally {
			
		}
		
	}

}

class Tool{
	public static int div(int a,int b)
	{
		return a/b;
	}
}
