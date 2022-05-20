import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;


public class Func {
		// String test
		//	public static void main(String [] args)
		//	{
		//		
		//	
		//		String sentence = "Hello World";
		//		String target = "Hello W";
		//		String show = null;
		//		String show_plus = null;
		//		int size = target.length();
		//		int index = sentence.indexOf(sentence);
		//		show = sentence.substring(index,size);
		//		show_plus = show.repeat(3);//重复三次
		//		System.out.println(show);
		//		System.out.println(show_plus);
		//		System.out.println(show.length());
		//		System.out.println(show.codePointCount(0, show.length()));
		//		show = String.join("-",show,show_plus);
		//		System.out.println(show);
		//	
//	}
	
	
		//here is StringBuilder Test
		//		public static void main(String [] args)
		//		{
		//			StringBuilder helper = new StringBuilder();
		//			helper.append("Wow");
		//			helper.appendCodePoint('\u2124');
		//			String show = helper.toString();
		//			System.out.println(show);
		//			System.out.println(show.length());
		//			System.out.println(show.codePointCount(0, show.length()));
		//		}
	
		//here is the Console控制台
		//		public static void main(String [] args) // 必须用控制台编译并且运行
		//		{
		//			Console helper = System.console();
		//			String usename = helper.readLine("User name: ");
		//			char[] passwd = helper.readPassword("Password : ");
		//			System.out.println(usename );
		//			System.out.println(passwd);
		//		}
	
		//here is the file test
		public static void main(String [] args) throws IOException//可能出现异常 标记即可
		{
			PrintWriter helper = new PrintWriter("haha.txt",StandardCharsets.UTF_8);
//			Scanner help = new Scanner(Path.of("haha.txt"),StandardCharsets.UTF_8);
//			String show2 = null;
			int test = 123456;
			helper.println(test);
			helper.close();//关闭文件以写入
			System.out.println("Fine.");
//			show2 = help.nextLine();
//			System.out.println(show2);
		}
		

}
