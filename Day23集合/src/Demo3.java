import java.util.ArrayList;
import java.util.Collection;

public class Demo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c.retainAll(c1);//ֻ��������
		//��������õĽ����ı䣬�ͷ���true�����ı�ͷ���false
		System.out.println(c);
		
		c.addAll(c1);//������Ԫ�صĸ���Ԫ�ض���ȡ���������
		//c.add(c1);//���������Ͽ���һ��Ԫ��
		boolean flag = c.containsAll(c1);//�ж��Ƿ��������
		System.out.println(flag);
		System.out.println(c);
		c.removeAll(c1);//ɾ�����ǽ���
		
		System.out.println(c);
	}

}
