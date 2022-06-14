import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	//集合去重
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add("Hello");
		list.add("Hello");
		list.add("The");
		list.add("The");
		list.add("The");
		list.add("The");
		list.add("World");
		list.add("World");
		System.out.println(list);
		list = DelRep((ArrayList) list);
		System.out.println(list);
		
	}
	
	public static ArrayList DelRep(ArrayList old)
	{
		ArrayList ret = new ArrayList();
		Iterator it = old.iterator();
		
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!ret.contains(obj))//如果新集合中不包含老集合中的元素
			{
				ret.add(obj);//添加
			}
		}
		
		return ret;
	}
}
