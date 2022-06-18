import java.util.Hashtable;

public class Demo5_HashMapAndHashTable {
	//1.Hashtable 线程安全	不可以存储null键和null值  jdk1.0 低效
	//2.HashMap 线程不安全  可以存储null键和null值  jdk 1.2高效
	//都是hash算法和双列表
	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<>();
		//table.put(null, null);不能执行
		
	}

}
