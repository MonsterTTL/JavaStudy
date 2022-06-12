import java.util.Scanner;

public class StringA {
	public static void main(String[] args) {
		var in = new Scanner(System.in);
		String b= in.nextLine();
		int c = Integer.parseInt(b);
		System.out.println(c);
		String a = in.next();
		System.out.println(a);
		
		String s1 = new String(new byte[] {99,100,101});//解码
		System.out.println(s1);
		
		StringBuilder helper = new StringBuilder();
		helper.appendCodePoint(99);
		System.out.println(helper);
		
		
		
		String s2 = "a" + "b"+"c";
		String s3 = "abc";
		
		System.out.println(s3 == s2);//true,Java中有常量优化机制
		System.out.println(s2.equals(s3));//true
		
		char[] arr = s2.toCharArray();
	}

}
