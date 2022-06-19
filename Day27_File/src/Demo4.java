import java.io.File;

public class Demo4 {
	//isDirectory 判断是否是目录
	//isFile() 判断是否是文件
	//exists 判断是否存在
	//canRead 判断是否可读
	//canWrite 判断是否可写
	//isHidden 判断是否隐藏
 	public static void main(String[] args) {
 		File file = new File("test1.txt");
 		System.out.println(file.isFile());
 		System.out.println(file.isDirectory());
 		file.setReadable(false);// Windows系统认为所有的文件都是可读的，所以设置没用
 								//但是可以设置写
 		System.out.println(file.canRead());
 		System.out.println("Can WIRTE? "+ file.canWrite());
 		file.setWritable(false);
 		System.out.println("Can WIRTE? "+ file.canWrite());//文件夹设了没用
		
	}
}
