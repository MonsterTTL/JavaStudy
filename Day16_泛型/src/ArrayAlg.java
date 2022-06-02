
public class ArrayAlg {
	public static Pair<Integer> maxmin(int[] arr)
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		for(int use:arr)
		{
			if(use > first) first = use;
			if(use <= second)second = use;
		}
		
		
		return new Pair<Integer>(first,second);
		
	}
	public static Pair<String> maxmin(String[] arr)
	{
		String first = arr[0];
		String second = arr[1];
		for(String use:arr)
		{
			if(use.compareTo(first) >= 0) first = use;
			if(use.compareTo(second) < 0)second = use;
		}
		return new Pair<String>(first,second);
		
	}

}
