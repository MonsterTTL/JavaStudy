import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Map K,V ����ֵ
//Map��˫�е� K,V��Map�ļ�ֵΨһ
//ֻ��Լ���Ч
//HashMap TreeMap
//Set �ײ����� Map
//Map���ϲ���ֱ�ӵ���
public class Demo1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);boolean e = map.containsKey("����");
		System.out.println(e);
		Integer c =	map.put("����", 27);//����ֵһ��������ԭ�еļ�ֵ���ҷ��ر����ǵĲ���
		Integer d = map.remove("����");//���ݼ�ɾ��ֵ������ɾ����ֵ
		e = map.containsKey("����");//�ж��Ƿ��������ļ�
									//map.containsValue()�ж��Ƿ���������ֵ
		System.out.println(e);
		System.out.println(c);
		System.out.println(d);
		System.out.println(map);
		
		Collection<Integer> value = map.values();//���ֵ
		System.out.println(value);//��ӡֵ
		System.out.println(map.size());//��ӡ��С��һ��Ϊ1
		
		
		
		
	}

}
