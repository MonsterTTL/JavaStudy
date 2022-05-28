package sort;

import java.util.Arrays;

public class mergesort {
	public static void Sort(int[] arr,int L,int R)
	{
		if(L == R)
			return ;
		Sort(arr,L,(L+R)/2);Sort(arr,(L+R)/2+1,R);
		merge(arr,L,R);
		
	}
	
	public static void merge(int[] arr1,int L,int R)
	{
		if(L == R)
			return ;
		int mid = (L+R)/2;int length = (R - L +1);
		int[] ret = new int[length];
		int left = L;int right = mid+1;int cur = 0;
		while(left <= mid && right <= R)
		{
			if(arr1[left] < arr1[right])
			{
				ret[cur++] = arr1[left++];
			}
			else
			{
				ret[cur++] = arr1[right++];
			}
		}
		while(left <= mid)
		{
			ret[cur++] = arr1[left++];
		}
		while(right <= R)
		{
			ret[cur++] = arr1[right++];
		}
		for(int i = 0;i < length;i++)
		{
			arr1[i+L] = ret[i];
		}
		return ;
		
		
	}
	
	
	
	
	
}
