import java.io.File;

public class Demo3 {
	public static void main(String[] args) {
		//demo();
		File file1 = new File("ooo");
		System.out.println(file1.delete());//ɾ�������ǲ��߻���վ���޷��ָ�
		
		File file2 = new File("ggg");
		System.out.println(file2.delete());//Ҳ����ɾ���ļ��У����Ǹ��ļ��б���Ϊ��
		
	}

	private static void demo() {
		File file1 = new File("123.txt");
		File file2 = new File("D:\\xxx.txt");//�ƶ���Ҫ����ԱȨ��
		System.out.println(file1.exists());
		System.out.println(file1.renameTo(file2));
	}

}
