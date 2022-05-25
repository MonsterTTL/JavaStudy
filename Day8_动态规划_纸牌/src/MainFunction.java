//��Ŀ��
//��̬�滮 -- ���ظ���
//����һ����������arr��������ֵ��ͬ��ָ���ų�һ���ߣ����A�����B��������ÿ��ֽ�ƣ��涨���A���ã�
//���B���ã�����ÿ�����ÿ�ζ�ֻ����������������ҵ�ֽ��
//���A�����B����������
//�뷵������ʤ�ߵķ���
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
	public static int f(int[]arr,int L,int R)//���ֺ���
	{
		if(L == R)
			return arr[L];
		int p1 = arr[L] + g(arr,L+1,R);
		int p2 = arr[R] + g(arr,L,R-1);
		return Math.max(p1, p2);
	}
	
	public static int g(int[]arr,int L,int R)//���ֺ���
	{
		if(L == R)
			return arr[L];
		int p1 = f(arr,L+1,R);
		int p2 = f(arr,L,R-1);
		return Math.min(p1, p2);
		
	}
	
	public static int function2(int []arr)//�Ľ��汾
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
	
	public static int f2(int[]arr,int L,int R,int[][]fmap,int[][]gmap)//���ֺ���
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
	
	public static int g2(int[]arr,int L,int R,int[][]fmap,int[][]gmap)//���ֺ���
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
