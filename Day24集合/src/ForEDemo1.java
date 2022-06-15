import java.util.ArrayList;

public class ForEDemo1 {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66};
		for (int i : arr) {
			System.out.println(i);
		}
		int a = sun(1,2,3,4,5,6,7,8,9);
		System.out.println(a);
		
		ArrayList<String> one = new ArrayList<>();
		one.add("ÕÒÅ¶Óã¸×");
		one.add("Å£°¡");
		for (String string : one) {
			System.out.println(string);
		}
	}
	public static int sun(int ...o)
	{
		int ret = 0;
		for(int i:o)
		{
			ret += i;
		}
		return ret;
	}
}
