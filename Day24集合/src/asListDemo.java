import java.util.Arrays;
import java.util.List;

public class asListDemo {
	public static void main(String[] args) {
		//����ת����
		String[] arr = {"aa","bb"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		//list.add("ddd");  //����ת���ϲ�֧�ָ���
		//����������������
		System.out.println(list);
		int[] arr2 = {11,22,55,66,77};
		List<?> list2 = Arrays.asList(arr2);
		System.out.println(list2);
		Integer[] arr3 = {11,22,55,66,77};
		List<?> list3 = Arrays.asList(arr3);
		System.out.println(list3);
		
		//List<int[]> list2 = Arrays.asList(arr2);  �����������͵�����ת���ɼ��ϣ��Ὣ�������鵱��һ������洢
	}
}
