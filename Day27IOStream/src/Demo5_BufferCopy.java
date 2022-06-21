import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
//缓冲区拷贝
public class Demo5_BufferCopy {
	public static void main(String[] args) throws IOException {
		
//		demo1();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("xxx.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("xyz.txt"));
//		close方法具有刷新的功能，在关闭流之前就会刷新一次缓冲区，将缓冲区的内容全部写入文件中
		int b;
		while((b = bis.read()) != -1)
		{
			bos.write(b);
			//bos.flush();
		}
		
		bos.close();
		bis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");  //创建输入流对象，关联文件
		FileOutputStream fos = new FileOutputStream("xyz.txt"); //创建输出流对象，关联文件
		BufferedInputStream bis = new BufferedInputStream(fis);  //分别包装
		BufferedOutputStream bos = new BufferedOutputStream(fos); //内部创建l8096大小的缓冲区数组
		
		int b;
		while((b = bis.read()) != -1)
		{
			bos.write(b);
		}
		
		bis.close(); //关包装后即可
		bos.close();
	}

}
