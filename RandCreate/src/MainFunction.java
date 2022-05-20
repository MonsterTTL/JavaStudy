import java.util.Arrays;

public class MainFunction {
	public static void main(String [] args)
	{
		int[] target = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] ret = new int[6];
		int use = 14;
		int cnt;
		for(int i = 0;i < ret.length;i++)
		{
			cnt = (int)(Math.random()*use);
			ret[i] = target[cnt];
			target[cnt] = target[use];
			use--;
		}
		
		Arrays.sort(ret);
		String show = Arrays.toString(ret);
		System.out.println(show);
		
		
		
	}

}
