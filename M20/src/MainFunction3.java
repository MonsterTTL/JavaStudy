
public class MainFunction3 {
	public static void main(String[] args)
	{
		String a = "Let's take Leetcode constest";
		
		System.out.println(reverseWords(a));
		
	}
	
	public static String reverseWords(String s)
	{
		int n = s.length();
		StringBuilder one = new StringBuilder();
		for(int i = n-1;i >= 0;i--)
		{
			one.append(s.charAt(i));
		}
		//s = one.toString();
		
		return one.toString();
	}

}
