import java.util.Arrays;

public class вш╨отксц {
	public static void main(String[] args) {
		String s = "21 56 29 87 100 11 12";
		String[] arr = s.split(" ");
		int[] test = new int[arr.length];
		for(int i = 0;i < test.length;i++)
		{
			test[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
	}

}
