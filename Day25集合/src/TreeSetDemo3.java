import java.util.TreeSet;

//TreeSet�Ƕ�Ԫ�ؽ��������
//��֤Ԫ��Ψһ
//����comparable�ӿ�
//compareTo �� ��ô����ôȡ  �ұ�
//compareTo ����  ���� ���
//compareTo 0 ����
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<Integer> temp = new TreeSet<>();
		temp.add(2);
		temp.add(9);
		temp.add(3);
		temp.add(4);
		temp.add(6);
		System.out.println(temp);
	}

}

class non implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
