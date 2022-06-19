import java.io.File;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		//demo1();
		File dir1 = new File("ddd");
		System.out.println(dir1.mkdir());
		
		File dir3 = new File("ggg\\ddd");
		System.out.println(dir3.mkdirs());//mkdirs会自动帮你创建父集的文件夹
		//mkdir不会创建，如果父集不存在就会返回false
		
	}

	private static void demo1() throws IOException {//创建文件
		File file = new File("D:\\JavaCode\\Day27_File\\123.txt");//如果没有就创建，返回true 反之则相反
		System.out.println(file.createNewFile());
		
		File cr = new File("ccc.txt");
		System.out.println(cr.createNewFile());
	}

}
