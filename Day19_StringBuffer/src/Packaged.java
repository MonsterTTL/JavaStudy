import java.util.Arrays;

public class Packaged {
	public static void main(String[] args)
	{
		//int[] a = {12};
		//int[] b = {13};
		//swap(a,b);
		//System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
		//System.out.println(Integer.toHexString(a));//转八进制
		//System.out.println(Integer.toBinaryString(a));//转二进制
		//String aString = Integer.toString(a);//数字转字符串
		//System.out.println(aString);
		//a = Integer.reverse(a);
		//System.out.println(Integer.toHexString(a));
		//System.out.println(Integer.toBinaryString(a));
		//int c = Integer.parseInt("999");//字符串转数字
		//int d = Integer.valueOf("9999");//字符转转数字（Integer）
		//System.out.println(c);
		//System.out.println(d);
		
		//自动装箱，把基本类型转为包装类型
		//自动拆箱：把包装类型转为基本类型
		String s = "true";
		char[] ar =  s.toCharArray();
		for(char d:ar)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		boolean a = Boolean.parseBoolean(s);
		System.out.println(a);
		Integer c = 127;
		Integer d = 127;
		swap(c,d);
		System.out.println(c);
		System.out.println(c == d);
		
	}
	
	public static void swap(Integer a,Integer b)
	{
		int temp = a;
		a = Integer.valueOf(b);
		b = temp;
		return;
		
	}

}
