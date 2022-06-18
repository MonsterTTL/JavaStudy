import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//第二种遍历方法
//把双列集合变成单列集合
public class Demo3_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		//Map.Entry是Map的内部接口，将键和值包装成Entry对象，并存储在Set集合中
		Set<Map.Entry<String,Integer>> entrySet  =  map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> entry = it.next();
			String Key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(Key + " = " + value);
		}
		//增强for循环
		for(Map.Entry<String, Integer> m : map.entrySet())
			System.out.println(m.getKey() + " "+m.getValue());
	}

}
