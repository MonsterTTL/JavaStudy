import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {
	//getAbsolutePath() : 获取绝对路径
	//getPath 获取路径
	//getName 获取名称
	//length 获取长度，字节数
	//lastModified 获取最后一次的修改时间，毫秒值
	//list 获取指定目录下所有文件或者文件夹的名称数组
	//listFiles 获取指定目录下所有文件或者文件夹的File数组
	public static void main(String[] args) {
		//demo1();
		File file = new File("C:\\Users\\19080\\Desktop\\周报");
		String[] arr = file.list();
		for (String string : arr) {
			System.out.println(string);
		}
		File[] arr2 = file.listFiles();
		for (File file2 : arr2) {
			System.out.println(file2);
		}
	}

	private static void demo1() {
		File file1 = new File("test1.txt");
		File file2 = new File("ccc");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getPath());//获取的是构造方法里传入的路径
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
		System.out.println("number: "+file1.length());
		System.out.println(file1.lastModified());//文件的最后修改时间 毫秒值
		Date d = new Date(file1.lastModified());
		SimpleDateFormat slp = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(slp.format(d));
	}

}
