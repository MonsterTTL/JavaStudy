
public class Demo1 {
	public static void main(String[] args) {
		
		System.out.println(fun(25));
		long g = fun2(25);
		System.out.println(Integer.toBinaryString((int) g));
	}
	
	//ตÝน้
	public static long fun(int n)
	{
		if(n == 1)
			return 1;
		else
			return n*fun(n-1);
	}
	
	public static long fun2(int n)
	{
		long ret = 1;
		for(int i = 1;i <= n;i++)
		{
			ret *= i;
		}
		return ret;
	}

}
