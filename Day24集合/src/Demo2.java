import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> one = new ArrayList<String>();
		one.add("a");
		one.add("b");
		one.add("c");
		one.add("d");
		one.add("e");
		//System.out.println(one.size());
		//1.һ��ɾ��
//		for(int i = 0;i < one.size();i++)
//		{
//			if(!("a".equals(one.get(i))))//һ�ζ�ɾ�͵ó�����Ϊ����Ҳ���ű���
//				{
//					one.remove(i);
//					i--;  //����--��ֹ����
//					System.out.println(i);
//				}
//		}
		//2.������
		Iterator<String> it = one.iterator();
		while(it.hasNext())
		{
			if("b".equals(it.next())) {
				// one.remove("b");  //���в����޸��쳣
				it.remove();
			}
		}
		//3.��ǿforѭ��
//		for(String string:one)//��Ϊ�ײ������Ļ��ǵ����������Բ���ɾ
//		{
//			if("b".equals(string)) {
//				one.remove(string);
//			}
//		}
		System.out.println(one);
	}

}
