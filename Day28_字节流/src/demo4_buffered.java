import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�������������е����ⷽ��
//readLine()
//newLine() �� \r\n������  ��newLine�ǿ�ƽ̨�ķ�����\r\nֻ֧��windowsϵͳ
public class demo4_buffered {
	public static void main(String[] args) throws IOException {
//		demo1();
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("cp.txt"));
		String line;
		while((line = br.readLine()) != null)
		{
			bw.write(line);
			bw.newLine(); //д���س����з�
		}
		
		br.close();
		bw.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("cp.txt"));
		
		String line ;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();
		bw.close();
	}

}
