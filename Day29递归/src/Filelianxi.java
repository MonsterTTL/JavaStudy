import java.io.File;
import java.util.Scanner;

public class Filelianxi {
	//从键盘接受一个文件夹路径，显示文件夹下所有的文件
	public static void main(String[] args) {
		File dir = getdir();
		printJava(dir);
	}
	public static File getdir()
	{
		Scanner sc = new Scanner(System.in);  
		String rou ;  
		System.out.println("请输入一个文件夹路径： ");
		while(true)
		{
			rou = sc.nextLine();
			File dir = new File(rou);
			if(!dir.exists())
			{
				System.out.println("Cant Find!");
			}
			else if(dir.isFile())
			{
				System.out.println("not a dir");
			}else
			{
				return dir;
			}
		}
	}
	public static void printJava(File dir)
	{
		File[] subFiles = dir.listFiles();
		for (File file : subFiles) {
			if(file.isFile() && file.getName().endsWith(".java"))
			{
				System.out.println(file.getName());
			}
			else if(file.isDirectory()){
				printJava(file);
			}
		}
	}
}
