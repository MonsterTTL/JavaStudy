import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		//用迭代器正反遍历
		
		ListIterator itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==================================");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
