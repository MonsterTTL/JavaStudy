import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//�������������
public class Test1 {
	//��ת�ĵ�����
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		ArrayList<String> ls = new ArrayList<String>();
		String sting;
		while((sting = br.readLine()) != null)
		{
			ls.add(sting);
		}
		br.close();  //���
		BufferedWriter bw = new BufferedWriter(new FileWriter("cp.txt"));//��
		for(int i = ls.size() - 1;i >= 0; i--)
		{
			bw.write(ls.get(i));
			bw.newLine();
		}
		
		bw.close();
		
		
	}

}
