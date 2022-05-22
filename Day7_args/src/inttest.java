
public class inttest {
	
	public static int MaxInt(int...args)
	{
		int largest = Integer.MIN_VALUE;
		for(int t:args)//用for each 循环实现
		{
			if(t > largest)
				largest = t;
		}
		return largest;
	}

}
