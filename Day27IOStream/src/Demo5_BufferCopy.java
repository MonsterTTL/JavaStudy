import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
//����������
public class Demo5_BufferCopy {
	public static void main(String[] args) throws IOException {
		
//		demo1();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("xxx.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("xyz.txt"));
//		close��������ˢ�µĹ��ܣ��ڹر���֮ǰ�ͻ�ˢ��һ�λ���������������������ȫ��д���ļ���
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
		FileInputStream fis = new FileInputStream("xxx.txt");  //�������������󣬹����ļ�
		FileOutputStream fos = new FileOutputStream("xyz.txt"); //������������󣬹����ļ�
		BufferedInputStream bis = new BufferedInputStream(fis);  //�ֱ��װ
		BufferedOutputStream bos = new BufferedOutputStream(fos); //�ڲ�����l8096��С�Ļ���������
		
		int b;
		while((b = bis.read()) != -1)
		{
			bos.write(b);
		}
		
		bis.close(); //�ذ�װ�󼴿�
		bos.close();
	}

}
