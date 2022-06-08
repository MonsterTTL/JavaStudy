package com.review.student;

import java.util.Arrays;
import java.util.function.Consumer;

public class ArraysTools {
	public static void main(String[] args)
	{
		int[] arr = new int[20];
		InitArr(arr);
		ShowArr(arr);
		
		ForEachArr(arr,new inup().new inner());
		ShowArr(arr);
		
	}
	
	public static void InitArr(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i < n;i++)
		{
			arr[i] = (int)(Math.random()*51);
		}
	}
	
	public static void ShowArr(int[] arr)
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void ForEachArr(int[] arr,Consumer<int[]> a)
	{
		
		a.accept(arr);
	}

}

 class inup{
	public class inner implements Consumer<int[]>
	{
		public void accept(int[] arr)
		{
			int n = arr.length;
			for(int i = 0; i < n;i++)
			{
				arr[i] += 1;
			}
		}
	}
}
