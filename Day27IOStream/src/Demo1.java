import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");//创建流对象
		int b ;
		//read方法为什么返回int，而不是byte
		//byte 的负一码值和255一致
		while((b = fis.read()) != -1)
		{
			System.out.print((char)(b));
		}
		//demo1(fis);
	}

	private static void demo1(FileInputStream fis) throws IOException {
		int x = fis.read();  //从硬盘上读取1个字节到内存上
		System.out.println(x);
		x = fis.read();
		System.out.println(x);
		fis.close();//关流，释放资源
	}

}
