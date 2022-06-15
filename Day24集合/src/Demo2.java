import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> one = new ArrayList<String>();
		one.add("a");
		one.add("b");
		one.add("c");
		one.add("d");
		one.add("e");
		//System.out.println(one.size());
		//1.一般删除
//		for(int i = 0;i < one.size();i++)
//		{
//			if(!("a".equals(one.get(i))))//一次多删就得出错，因为长度也跟着变了
//				{
//					one.remove(i);
//					i--;  //索引--防止出错
//					System.out.println(i);
//				}
//		}
		//2.迭代器
		Iterator<String> it = one.iterator();
		while(it.hasNext())
		{
			if("b".equals(it.next())) {
				// one.remove("b");  //会有并发修改异常
				it.remove();
			}
		}
		//3.增强for循环
//		for(String string:one)//因为底层依赖的还是迭代器，所以不能删
//		{
//			if("b".equals(string)) {
//				one.remove(string);
//			}
//		}
		System.out.println(one);
	}

}
