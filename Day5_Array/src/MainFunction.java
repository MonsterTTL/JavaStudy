import java.util.Arrays;

public class MainFunction {
	public static void  main(String [] args)
	{
		
		String show = "";
		int [] arry = new int[]{10,2,3,4,8,9};
		for(int i:arry)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(arry);
		show = Arrays.toString(arry);
		System.out.println(show);
		arry = new int[] {100,2,3,5,7,11,17,18,19};
		for(int i:arry)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(arry);
		show = Arrays.toString(arry);
		System.out.println(show);
	}
	
}
