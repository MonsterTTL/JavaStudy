import java.util.ArrayList;
import java.util.Collection;

public class Demo2 {
	//ArrayList ת����
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		System.out.println(c);
		Object[] arr = c.toArray();
		for(Object a:arr)
		{
			System.out.println(a);//��̬��
		}
	}
}
