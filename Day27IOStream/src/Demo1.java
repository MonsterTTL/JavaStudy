import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");//����������
		int b ;
		//read����Ϊʲô����int��������byte
		//byte �ĸ�һ��ֵ��255һ��
		while((b = fis.read()) != -1)
		{
			System.out.print((char)(b));
		}
		//demo1(fis);
	}

	private static void demo1(FileInputStream fis) throws IOException {
		int x = fis.read();  //��Ӳ���϶�ȡ1���ֽڵ��ڴ���
		System.out.println(x);
		x = fis.read();
		System.out.println(x);
		fis.close();//�������ͷ���Դ
	}

}
