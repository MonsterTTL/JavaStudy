import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//�ڶ��ֱ�������
//��˫�м��ϱ�ɵ��м���
public class Demo3_Iterator {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		//Map.Entry��Map���ڲ��ӿڣ�������ֵ��װ��Entry���󣬲��洢��Set������
		Set<Map.Entry<String,Integer>> entrySet  =  map.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> entry = it.next();
			String Key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(Key + " = " + value);
		}
		//��ǿforѭ��
		for(Map.Entry<String, Integer> m : map.entrySet())
			System.out.println(m.getKey() + " "+m.getValue());
	}

}
