
public class inttest {
	
	public static int MaxInt(int...args)
	{
		int largest = Integer.MIN_VALUE;
		for(int t:args)//��for each ѭ��ʵ��
		{
			if(t > largest)
				largest = t;
		}
		return largest;
	}

}
