import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//字节读取中文会出错
public class Demo6Chinese {
	public static void main(String[] args) throws IOException {
//		demo1();
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("我日".getBytes());
		fos.write("\r\n".getBytes());
		fos.write("nine?".getBytes());
		
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[2];
		int len;
		while((len = fis.read(arr)) != -1)
		{
			System.out.println(new String(arr,0,len));
		}
		fis.close();
	}

}
