import java.util.ArrayList;
import java.util.Collections;

public class Demo6_Collect {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("e"); 
		list.add("b"); 
		list.add("g"); 
		list.add("d");
		list.add("a");
		list.add("c");
		Collections.sort(list);//��̬����������
		//list.sort();�Ƚ�������
		System.out.println(list);
		//System.out.println(Collections.binarySearch(list, "a"));//���ֲ���,��Ҫ����
		System.out.println(Collections.max(list));//��ȡ���ֵ
		Collections.reverse(list);//��ת
		System.out.println(list);
		Collections.shuffle(list);//���������ϴ�ƣ�
		System.out.println(list);
	}

}
