import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		Integer i = map.get("����");//���ݼ�������ֵ
		
		Set<String> KeySet = map.keySet();//��ȡ���еļ�
		for (String string : KeySet) {
			System.out.println(string+" = "+map.get(string));
		}
		System.out.println("===================================");
		Iterator<String> it = KeySet.iterator();//������
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key + " = "+map.get(key));
		}
	}

}
