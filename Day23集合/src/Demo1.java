import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add("Hello");
		a.add(111);
		System.out.println(a);
		a.remove(111);//ɾ������
		System.out.println(a);
		boolean flag = a.contains("Hello");//�Ƿ������Ԫ��
		System.out.println(flag);//
		a.clear();//���
	}
	
	

}
