import java.io.File;

public class Demo4 {
	//isDirectory �ж��Ƿ���Ŀ¼
	//isFile() �ж��Ƿ����ļ�
	//exists �ж��Ƿ����
	//canRead �ж��Ƿ�ɶ�
	//canWrite �ж��Ƿ��д
	//isHidden �ж��Ƿ�����
 	public static void main(String[] args) {
 		File file = new File("test1.txt");
 		System.out.println(file.isFile());
 		System.out.println(file.isDirectory());
 		file.setReadable(false);// Windowsϵͳ��Ϊ���е��ļ����ǿɶ��ģ���������û��
 								//���ǿ�������д
 		System.out.println(file.canRead());
 		System.out.println("Can WIRTE? "+ file.canWrite());
 		file.setWritable(false);
 		System.out.println("Can WIRTE? "+ file.canWrite());//�ļ�������û��
		
	}
}
