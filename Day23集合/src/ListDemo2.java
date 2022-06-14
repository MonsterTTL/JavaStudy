import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("周哥");
		list.add("走司机");
		list.add("绿哥");
		list.add("zz");
		for(int i = 0;i < list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		ListIterator it = list.listIterator();//List特有的迭代器
		while(it.hasNext())
		{
			String name = (String)it.next();
			if(name.equals("绿哥"))//遍历的同时在修改，并发修改；如果想在迭代中修改，可以使用ListIterator中的方法
			{
				//list.add("GG");并发修改了
				it.add("GG");
			}
		}
		System.out.println(list);
	}

}
