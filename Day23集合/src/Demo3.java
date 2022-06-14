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
		c.retainAll(c1);//只保留交集
		//如果被调用的交集改变，就返回true，不改变就返回false
		System.out.println(c);
		
		c.addAll(c1);//把其他元素的各个元素都抽取出来再添加
		//c.add(c1);//把其他集合看作一个元素
		boolean flag = c.containsAll(c1);//判断是否包含集合
		System.out.println(flag);
		System.out.println(c);
		c.removeAll(c1);//删除的是交集
		
		System.out.println(c);
	}

}
