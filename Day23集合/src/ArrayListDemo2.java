import java.util.LinkedList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		var list = new LinkedList();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("!");
		
		System.out.println(list);
		var list2 = new LinkedList();
		list2.addFirst("��");//ͷ������
		list2.addFirst("��");
		list2.addFirst("��");
		list2.addFirst("��");
		list2.addFirst("��");
		list2.addFirst("��");
		list2.addFirst("!");
		System.out.println(list2);
		//list2.get(0);
		System.out.println(list2.getFirst().toString() + list2.getLast());//��ȡ��һ�������һ��
		System.out.println(list.removeLast());//ɾ��β��㲢���ر�ɾ���Ķ���ֵ
		
	}

}
