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
		
		//对集合中的元素迭代
		Iterator It = c.iterator();
		boolean flag = It.hasNext();//判断集合是否有下一个元素
		System.out.println(flag);
		
		while(It.hasNext())
		{
			Object one = It.next();
			System.out.println(one);
		}
	}

}
