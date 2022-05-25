//题目：
//动态规划 -- 找重复解
//给定一个整型数组arr，代表数值不同的指派排成一条线，玩家A和玩家B依次拿走每张纸牌，规定玩家A先拿，
//玩家B后拿，但是每个玩家每次都只能拿走最左或者最右的纸牌
//玩家A和玩家B都绝顶聪明
//请返回最后获胜者的分数
public class MainFunction {
	public static void main(String[] args)
	{
		int[] arr = {1,3,3,1,3,5,1};
		int ret = MainFunction.function(arr);
		int ret2 = MainFunction.function2(arr);
		System.out.println(ret);
		System.out.println(ret2);
	}
	public static int function(int[] arr)
	{
		int first = f(arr,0,arr.length-1);
		int last = g(arr,0,arr.length-1);
		return Math.max(last,first);
	}
	public static int f(int[]arr,int L,int R)//先手函数
	{
		if(L == R)
			return arr[L];
		int p1 = arr[L] + g(arr,L+1,R);
		int p2 = arr[R] + g(arr,L,R-1);
		return Math.max(p1, p2);
	}
	
	public static int g(int[]arr,int L,int R)//后手函数
	{
		if(L == R)
			return arr[L];
		int p1 = f(arr,L+1,R);
		int p2 = f(arr,L,R-1);
		return Math.min(p1, p2);
		
	}
	
	public static int function2(int []arr)//改进版本
	{
		int N = arr.length;
		int [][] fmap = new int[N][N];
		int [][] gmap = new int[N][N];
		for(int i = 0;i < N ;i++)
			for(int j = 0;j < N;j++)
			{
				fmap[i][j] = -1;
				gmap[i][j] = -1;
			}
		int p1 = f2(arr,0,arr.length -1,fmap,gmap);
		int p2 = g2(arr,0,arr.length -1,fmap,gmap);
		return Math.max(p1, p2);
	}
	
	public static int f2(int[]arr,int L,int R,int[][]fmap,int[][]gmap)//先手函数
	{
		int ans = 0;
		if(fmap[L][R] != -1)
			return fmap[L][R];
		if(L == R)
		{
			ans = arr[L];
		}
		else {
		int p1 = arr[L] + g2(arr,L+1,R,fmap,gmap);
		int p2 = arr[R] + g2(arr,L,R-1,fmap,gmap);
		ans =  Math.max(p1, p2);
		}
		fmap[L][R] = ans;
		return ans;
		
	}
	
	public static int g2(int[]arr,int L,int R,int[][]fmap,int[][]gmap)//后手函数
	{
		int ans = 0;
		if(gmap[L][R] != -1)
		{
			return gmap[L][R];
		}
		if(L == R)
		{
			ans = arr[L];
		}
		else {
		int p1 = f2(arr,L+1,R,fmap,gmap);
		int p2 = f2(arr,L,R-1,fmap,gmap);
		ans = Math.min(p1, p2);
		}
		gmap[L][R] = ans;
		return ans;
		
	}
	

}
