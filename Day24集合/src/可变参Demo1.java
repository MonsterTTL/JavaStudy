
public class 可变参Demo1 {
	public static void main(String[] args) {
		int max = max(99,100,50,181818,-55);
		System.out.println(max);
		int [] arr = {15,55,66,99,101,-88};
		max = max(arr);
		System.out.println(max);
	}
	
	public static int sum(int...a)//可变参就是一个数组
	{
		int ret = 0;
		for(int c:a)
		{
			ret += c;
		}
		return ret;
	}
	
	public static int max(int...a)
	{
		int max = Integer.MIN_VALUE;
		for(int c:a)
		{
			if(c> max)
				max = c;
		}
		return max;
	}

}
