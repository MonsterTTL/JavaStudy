
public class QQClk {
	public static void main(String[] args) {
		System.out.println((int)'A');
		//boolean flag = ChickQQ("53453453453453123456");
		boolean flag = CheCkQQ("151515aaa");
		System.out.println(flag);
	}
	public static boolean ChickQQ(String qq)//“ª∞„ µœ÷
	{
		char [] arr = qq.toCharArray();
		if(arr[0] == '0')
			return false;
		if(arr.length < 5 || arr.length > 15)
			return false;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] > 'A' && arr[i] < 'z')
				return false;
		}
		return true;
		
	}
	
	public static boolean CheCkQQ(String qq)
	{
		String test = "[1-9]\\d{4,14}";
		return qq.matches(test);
	}

}


