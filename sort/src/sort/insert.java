package sort;

public class insert {
	
	public static void insertSort(int[] arr)
	{
		int n = arr.length;int temp = 0;
		for(int i = 1;i < n;i++)
			for(int j = i;j > 0&&arr[j] > arr[j-1];j--)
			{
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		
	}

}
