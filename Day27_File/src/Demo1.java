import java.io.File;
import java.io.FileInputStream;

public class Demo1 {
	public static void main(String[] args) {
		//FileInputStream fis = new FileInputStream();
		//demoT1();
		//demo2();
		File fa = new File("D:\\\\JavaCode\\\\Day27_File");
		String child = "test1.txt";
		File zi = new File(fa,child);
		System.out.println(zi.exists());
	}

	private static void demo2() {
		String parent = "D:\\JavaCode\\Day27_File";//父集路径
		String child = "test1.txt";//子集路径
		File file = new File(parent,child);
		System.out.println(file.exists());
	}

	private static void demoT1() {
		File file = new File("D:\\JavaCode\\Day27_File\\test1.txt");//文件路径
		System.out.println(file.exists());//文件是否存在
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
	}

}
