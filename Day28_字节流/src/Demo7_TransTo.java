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
		//用默认编码表读写，出现错误
		//demo1();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8"));
		// 带缓冲的字符流读取，以指定的编码读字符
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		int ch;
		//用指定码表读字符
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
