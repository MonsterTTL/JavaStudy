import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo7 {
	public static void main(String[] args) {
		File file = new File("D:\\");
		String[] arr = file.list(new fi());
//		for (String string : arr) {
//			System.out.println(string);
//		}
		File[] arr2 = file.listFiles(new fi());
		for (File file2 : arr2) {
			System.out.println(file2);
		}
	}

}

class fi implements FilenameFilter{


	@Override
	//是这个filenameFilter
	public boolean accept(File dir, String name) {//过滤器
		File file = new File(dir,name);
		
		return file.isFile() &&file.getName().endsWith(".jpg");
	}
	
}