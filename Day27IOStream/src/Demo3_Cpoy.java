import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//复制文件 逐个字节的拷贝  -- 慢速（非常慢）
public class Demo3_Cpoy {
	public static void main(String[] args) throws IOException {
		//demo1();
		demo2();
		System.out.println(System.currentTimeMillis());
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("mptest.mp4");
		FileOutputStream fos = new FileOutputStream("cop.mp4");
		int len = fis.available();
		System.out.println(len);
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		fos.write(arr);
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("mptest.mp4");
		FileOutputStream fos = new FileOutputStream("cop11.mp4");
		int b ;
		while((b = fis.read()) != -1)
		{
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
