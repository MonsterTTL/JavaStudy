import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {
	public static void main(String[] args) throws IOException {
//		demo1();
		try(FileInputStream fis = new FileInputStream("xxx.txt"); //自动关闭资源
		FileOutputStream fos = new FileOutputStream("xyz.txt");
				my one = new my();)
		{
			int b;
			while((b = fis.read()) != -1)
			{
				fos.write(b);
			}
		}
		
		
		
		
		//fis.close();
		//fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("xyz.txt");
		
		int b ;
		while((b = fis.read()) != -1)
		{
			fos.write(b);
		}
		
			
		}finally {   //finally 语句的嵌套，目的是尽量多的关闭  1.6以前的做法
			try {
			if(fis != null)
				fis.close();
			}finally {
				if(fos != null)
				fos.close();
			}
			
		}
	}

}

class my implements AutoCloseable{

	@Override
	public void close()  {
		System.out.println("关了");
		
	}
	
}
