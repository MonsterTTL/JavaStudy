import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Integer i = map.get("张三");//根据键来遍历值
		
		Set<String> KeySet = map.keySet();//获取所有的键
		for (String string : KeySet) {
			System.out.println(string+" = "+map.get(string));
		}
		System.out.println("===================================");
		Iterator<String> it = KeySet.iterator();//迭代器
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key + " = "+map.get(key));
		}
	}

}
