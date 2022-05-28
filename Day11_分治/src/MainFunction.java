
public class MainFunction {
	public static void main(String[]args)
	{
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int[] ret = {-99};int[] ret2 = {-99};int[] ret3= {-99};
		int mid = (0+arr.length-1)/2;
		process2(arr,0,mid,ret);process2(arr,mid+1,arr.length-1,ret2);
		int result1 = process2(arr,0,arr.length-1,ret3);
		int result = Math.max(ret[0],ret2[0]);
		result= Math.max(result1, ret3[0]);
		System.out.println(result);
	}
	
	public static int process(int[]nums,int L,int R)
	{
		int mid = (L+R)/2;
		if(L == R)
		{
			return  nums[L];
					
		}
		else
		{
			return Math.max(process(nums,L,mid), process(nums,mid+1,R));
		}
	
	}
	public static int process2(int[]nums,int L,int R,int[] ret)
	{
		if(L > R)
			return 0;
		if(L == R)
			return nums[L];
		else {
			int mid = (L+R)/2;
			int p1 = process2(nums,L,mid,ret);int p2 = process2(nums,mid+1,R,ret);
			ret[0] = Math.max(ret[0], p1+p2);
			return p1+p2;
		}
	}

}
