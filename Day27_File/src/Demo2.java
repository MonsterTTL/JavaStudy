import java.io.File;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//demo1();
		File dir1 = new File("ddd");
		System.out.println(dir1.mkdir());
		
		File dir3 = new File("ggg\\ddd");
		System.out.println(dir3.mkdirs());//mkdirs���Զ����㴴���������ļ���
		//mkdir���ᴴ����������������ھͻ᷵��false
		
	}

	private static void demo1() throws IOException {//�����ļ�
		File file = new File("D:\\JavaCode\\Day27_File\\123.txt");//���û�оʹ���������true ��֮���෴
		System.out.println(file.createNewFile());
		
		File cr = new File("ccc.txt");
		System.out.println(cr.createNewFile());
	}

}
