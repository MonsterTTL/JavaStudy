import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("text.txt");
		FileWriter fw = new FileWriter("text1.txt");
		int n;
		while((n = fr.read()) != -1)
		{
			System.out.println((char)n);//向下强转，变为字符
		}
		fw.write("老司机");
		fw.write(97);
		
		fr.close();
		fw.close();
	}
}
