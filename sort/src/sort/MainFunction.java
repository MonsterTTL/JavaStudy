package sort;

import java.util.Arrays;

public class MainFunction {
	public static void main(String[] args)
	{
		int[] arr = new int[50];
		ArrInit(arr.length,arr);
		int[] arr2 = Arrays.copyOfRange(arr, 0, 25);
		//insert.insertSort(arr);
		mergesort.Sort(arr,0,49);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void ArrInit(int number,int[] arr)
	{
		for(int i = 0;i < number;i++)
		{
			arr[i] =(int)(Math.random()*50+1);
		}
	}

}
