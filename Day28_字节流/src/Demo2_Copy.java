import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2_Copy {
	public static void main(String[] args) throws IOException {
//		demo1();
		FileReader fr = new FileReader("text.txt");
		FileWriter fw = new FileWriter("text1.txt");
		char[] arr = new char[1024];
		int len;
		while((len = fr.read(arr)) != -1)
		{
			fw.write(arr);
		}
		fw.close();
		fr.close();
		
	}

	private static void demo1() throws IOException, FileNotFoundException {
		FileWriter fw = new FileWriter("text.txt");
		FileReader fr = new FileReader("text1.txt");//底层有一个1024字符大小的缓冲区
		//字符流不能拷贝纯文本的文件
		int c;
		while((c = fr.read()) != -1)
		{
			fw.write(c);
		}
		
		fw.close();
		fr.close();
	}

}
