import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class Demo7_TransTo {
	public static void main(String[] args) throws IOException {
		//FileReader fr = new FileReader("utf-8.txt");
		//FileWriter fw = new FileWriter("gbk.txt");
		//��Ĭ�ϱ�����д�����ִ���
		//demo1();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8"));
		// ��������ַ�����ȡ����ָ���ı�����ַ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		int ch;
		//��ָ�������ַ�
		InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"),Charset.forName("utf-8"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),Charset.forName("gbk"));
		while((ch = isr.read()) != -1)
		{
			osw.write(ch);
		}
		
		osw.close();
		isr.close();
	}

}
