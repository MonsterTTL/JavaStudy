import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Map K,V 键和值
//Map是双列的 K,V，Map的键值唯一
//只针对键有效
//HashMap TreeMap
//Set 底层依赖 Map
//Map集合不能直接迭代
public class Demo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);boolean e = map.containsKey("张三");
		System.out.println(e);
		Integer c =	map.put("赵六", 27);//若键值一样，覆盖原有的键值并且返回被覆盖的部分
		Integer d = map.remove("张三");//根据键删除值，返回删除的值
		e = map.containsKey("张三");//判断是否包含传入的键
									//map.containsValue()判断是否包含传入的值
		System.out.println(e);
		System.out.println(c);
		System.out.println(d);
		System.out.println(map);
		
		Collection<Integer> value = map.values();//获得值
		System.out.println(value);//打印值
		System.out.println(map.size());//打印大小，一对为1
		
		
		
		
	}

}
