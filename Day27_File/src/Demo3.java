import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		//demo();
		File file1 = new File("ooo");
		System.out.println(file1.delete());//删除，但是不走回收站，无法恢复
		
		File file2 = new File("ggg");
		System.out.println(file2.delete());//也可以删除文件夹，但是该文件夹必须为空
		
	}

	private static void demo() {
		File file1 = new File("123.txt");
		File file2 = new File("D:\\xxx.txt");//移动需要管理员权限
		System.out.println(file1.exists());
		System.out.println(file1.renameTo(file2));
	}

}
