import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {
	//getAbsolutePath() : ��ȡ����·��
	//getPath ��ȡ·��
	//getName ��ȡ����
	//length ��ȡ���ȣ��ֽ���
	//lastModified ��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	//list ��ȡָ��Ŀ¼�������ļ������ļ��е���������
	//listFiles ��ȡָ��Ŀ¼�������ļ������ļ��е�File����
	public static void main(String[] args) {
		//demo1();
		File file = new File("C:\\Users\\19080\\Desktop\\�ܱ�");
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
		System.out.println(file1.getPath());//��ȡ���ǹ��췽���ﴫ���·��
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getPath());
		System.out.println("number: "+file1.length());
		System.out.println(file1.lastModified());//�ļ�������޸�ʱ�� ����ֵ
		Date d = new Date(file1.lastModified());
		SimpleDateFormat slp = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(slp.format(d));
	}

}
