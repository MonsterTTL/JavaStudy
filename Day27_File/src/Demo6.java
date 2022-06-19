import java.io.File;

public class Demo6 {
	public static void main(String[] args) {
		File file = new File("D:\\");
		System.out.println(file.isDirectory());
		
		String[] arr = file.list();//获取在D盘下所有的文件或文件夹
		for (String string : arr) {
			if(string.endsWith(".jpg"))
				System.out.println(string);
		}
		
		File[] arr2 = file.listFiles();//获取D盘下所有的文件或文件夹对象
		for (File file2 : arr2) {
			if(file2.isFile() && file2.getName().endsWith(".jpg"))
				System.out.println(file2);
		}
	}

}
