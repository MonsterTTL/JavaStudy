
public class ArrayAlg {
	public static <T extends Comparable> Pair<T> minmax(T[] arr)
	{
		if(arr == null || arr.length == 0)
			return null;
		T min = arr[0];
		T max = arr[0];
		for(T use:arr)
		{
			if(use.compareTo(max) <= 0)max = use;
			if(use.compareTo(min) > 0)min = use;
		}
		return new Pair<T>(max,min);
		
	}

}
