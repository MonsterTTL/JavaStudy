
public class arra<T> {
	public static <T>void reverse(T[] arr)
	{
		int n = arr.length;
		T temp;
		for(int i = 0; i < n/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}
	
	public static void reverse(int[] arr)
	{
		int n = arr.length;
		int temp;
		for(int i = 0; i < n/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}
}
