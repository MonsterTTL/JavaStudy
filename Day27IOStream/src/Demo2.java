import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fout = new FileOutputStream("xyz.txt",true);//׷��ģʽĩβд����
		fout.write(97);//���ݶ�Ӧ�����ֵ��д
		fout.write(98);
		fout.write(99);
		fout.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fout = new FileOutputStream("xyz.txt");//���û�и��ļ������Զ�����
		fout.write(97);//���ݶ�Ӧ�����ֵ��д
		fout.write(98);
		fout.write(99);
		fout.close();
	}
}
