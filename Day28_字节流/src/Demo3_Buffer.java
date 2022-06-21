import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3_Buffer {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
		BufferedReader br = new BufferedReader(new FileReader("text1.txt"));
		
		int c;
		while((c = br.read()) != -1)
		{
			bw.write(c);
		}
		
		bw.close();
		br.close();
	}
}
