import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItorDemo1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		
		//�Լ����е�Ԫ�ص���
		Iterator It = c.iterator();
		boolean flag = It.hasNext();//�жϼ����Ƿ�����һ��Ԫ��
		System.out.println(flag);
		
		while(It.hasNext())
		{
			Object one = It.next();
			System.out.println(one);
		}
	}

}
