import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(0,"G");//ָ��λ�ò��룬ע�ⲻҪԽ�� ,0 <= index <= size������
		System.out.println(list);
		
		Object one = list.remove(0);//ͨ������ɾ��Ԫ�أ�����ɾ����Ԫ�ط���
			//�������㿪ʼ
			//ֻ��list����������
		list.set(1, "��˾��");//������ֵ����
		one = list.get(1);//��ȡԪ�أ�����ɾ��
	
		System.out.println(one);
	}
	
}
