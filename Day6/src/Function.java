import java.util.Arrays;
import java.util.Random;

public class Function {
	public static void main(String[] args)
	{
		Random helper = new Random();
		int [] arr = new int[20];
		String show = null;
		for(int i = 0;i < 20 ; i++)
		{
			arr[i] = helper.nextInt(11);
		}
		Arrays.sort(arr);
		show = Arrays.toString(arr);
		System.out.println(show);
	}

}
