import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�ܸ�");
		list.add("��˾��");
		list.add("�̸�");
		list.add("zz");
		for(int i = 0;i < list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		ListIterator it = list.listIterator();//List���еĵ�����
		while(it.hasNext())
		{
			String name = (String)it.next();
			if(name.equals("�̸�"))//������ͬʱ���޸ģ������޸ģ�������ڵ������޸ģ�����ʹ��ListIterator�еķ���
			{
				//list.add("GG");�����޸���
				it.add("GG");
			}
		}
		System.out.println(list);
	}

}
