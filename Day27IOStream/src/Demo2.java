import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//demo1();
		FileOutputStream fout = new FileOutputStream("xyz.txt",true);//追加模式末尾写（）
		fout.write(97);//根据对应的码表值来写
		fout.write(98);
		fout.write(99);
		fout.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileOutputStream fout = new FileOutputStream("xyz.txt");//如果没有该文件，则自动创建
		fout.write(97);//根据对应的码表值来写
		fout.write(98);
		fout.write(99);
		fout.close();
	}
}
