import java.util.HashSet;

public class SetDemo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); //Set��û���ظ�Ԫ��
		boolean f1 = hs.add("a");	//Set���������������ظ�����ȡ��һ��
		boolean f2 = hs.add("b");  //�洢�ظ�Ԫ��ʱ����false
		hs.add("b");				//û����дtoString,�����̳��˸������д�˵�toString
		hs.add("d");
		hs.add("e");
		hs.add("f");
		
		System.out.println(f1);
		System.out.println(f2);  
		System.out.println(hs);
		for (String string : hs) {
			System.out.println(string);
		}
	}

}


