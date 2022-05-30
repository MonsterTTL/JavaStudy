
public class ArrayAlg {
	
	public static class Pair{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
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
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int use:arr)
			{
				max = Math.max(max, use);
				min = Math.min(min, use);
			}
			return new Pair(max,min);
			
		}
		
	}

}
