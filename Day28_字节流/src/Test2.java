import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.TreeMap;

public class Test2 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test2u.txt"),"gbk"));
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		int ch;
		while((ch = br.read())  != -1)
		{
			char c = (char)ch;
			if(!tm.containsKey(c))
			{
				tm.put(c, 1);
			}
			else
			{
				tm.put(c,tm.get(c)+1);
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
		for(Character key: tm.keySet())
		{
			bw.write(key + "=" + tm.get(key));
			bw.newLine();
		}
		bw.close();
		
	}
}
