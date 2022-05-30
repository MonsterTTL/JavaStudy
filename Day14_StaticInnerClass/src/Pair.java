
public class Pair {
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
	
	public Pair(int ma,int mi)
	{
		max = ma;
		min = mi;
	}
	
	public int getMax()
	{
		return max;
	}
	public int getMin()
	{
		return min;
	}
	
	public static Pair maxmin(int[] arr)
	{
		int mi = Integer.MAX_VALUE;
		int ma = Integer.MIN_VALUE;
		for(int use:arr)
		{
			if(mi > use)
				mi = use;
			if(ma < use)
				ma = use;
		}
		
		return new Pair(ma,mi);
	}

}
