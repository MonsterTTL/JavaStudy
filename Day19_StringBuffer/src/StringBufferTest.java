
public class StringBufferTest {
	public static void main(String[] args)
	{
		StringBuffer one = new StringBuffer();//空参构造
		StringBuffer two = new StringBuffer(32);//指定容量大小的构造
		StringBuffer three = new StringBuffer("Hello");//指定初始字符串的构造
		
		one.append("The");//添加内容
		two.append("World");
		String show = three.toString()+one.toString()+two.toString();//StringBuffer重写了toString方法
		System.out.println(show);
		
		three.insert(0, " The ");//插入操作，从头部开始插入
		three.insert(0, "World");
		System.out.println(three);
		
		
		
		
	}
	
	public static void ShowSbInf(StringBuffer sb)
	{
		System.out.println("===========================");
		System.out.println("The number of chars: " + sb.length());//容器中的字符个数
		System.out.println("The real capacity is :" + sb.capacity());//容器中的实际容量
		System.out.println("===========================");
	}

}
