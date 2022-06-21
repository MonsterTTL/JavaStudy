import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4_ArrayCopy {
	
	public static void main(String[] args) throws IOException {
		//demo1();
		//demo2();
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		byte[] arr = new byte[1024];//类缓冲区1
		int n;
		while((n = fis.read(arr)) != -1)
		{
			fos.write(arr,0,n);//,0 == 偏移量（数组索引）,n为读取几个
		}
		
		fis.close();
		fos.close();
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		byte[] arr = new byte[2];
		int n;
		while((n = fis.read(arr))!= -1)
		{
			fos.write(arr,0,n);//,0 == 偏移量数组索引（）,n为读取几个
		}
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[]arr = new byte[2];
		int a = fis.read(arr);
		System.out.println(a);
		for (byte b : arr) {
			System.out.println(b);
		}
		System.out.println("=====================================");
		
		int c = fis.read(arr);
		System.out.println(c);
		for (byte b : arr) {
			System.out.println(b);
		}
	}
}
