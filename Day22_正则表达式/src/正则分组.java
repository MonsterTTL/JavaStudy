import java.util.Arrays;

public class ������� {
	public static void main(String[] args) {
		//���� 
		String regx = "(.)\\1(.)\\2";//��һ�飬\\1�����һ���ֳ���һ��
									 // \\2����ڶ����ֳ���һ��
		System.out.println("  ����".matches(regx));
		
		regx = "(..)\\1";
		System.out.println("ƹ��ƹ��".matches(regx));
		
		String s2 = "����....Ҫ...Ҫ.......Ҫ.ѧ....ѧѧ...��.....��..��...��";
		String s3 = s2.replaceAll("\\.+", "");//��..ȥ��
		System.out.println(s3);
		String s4 = s3.replaceAll("(.)\\1+", "$1");//$1�����һ���е�����
		System.out.println(s4);
		
	}

}
