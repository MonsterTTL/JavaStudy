import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(0,"G");//指定位置插入，注意不要越界 ,0 <= index <= size都可以
		System.out.println(list);
		
		Object one = list.remove(0);//通过索引删除元素，将被删除的元素返回
			//索引从零开始
			//只有list集合有索引
		list.set(1, "走司机");//按索引值设置
		one = list.get(1);//获取元素，但不删除
	
		System.out.println(one);
	}
	
}
