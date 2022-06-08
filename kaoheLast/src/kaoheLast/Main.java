package kaoheLast;

public class Main {
	public static void main(String[] args)
	{
		String a = "alex";
		String b = "aaleeex";
		boolean flag = isName(a,b);
		System.out.println(flag);
	}
	
	public static boolean isName(String name,String type)
	{
		int n1 = name.length();
		int n2 = type.length();
		StringBuilder helper = new StringBuilder();
		int p1 = 0;int p2 = 0;
		while(p1 < n1&&p2 < n2)
		{
			if(name.charAt(p1) == type.charAt(p2))
			{
				helper.append(name.charAt(p1));
				p1++;p2++;
			}
			else
			{
				p2++;
			}
			
		}
		String c3 = helper.toString();
		if(c3.equals(name))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
