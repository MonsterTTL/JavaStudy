import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo7_CardGame {
	//1.����һ�����϶��󣬴洢��
	//2.ϴ��suffle
	//3.����
	//4.���Ƶ�����
	public static void main(String[] args) {
			String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			String[] color = {"����","����","��Ƭ","÷��"};
			HashMap<Integer,String> hm = new HashMap<>();
			int index = 0;
			ArrayList<Integer> poker = new ArrayList<>();//������
			for(String s1:num)
			{
				for(String s2:color) {
					poker.add(index);
					hm.put(index++,s2.concat(s1));
					
				}
			}
			poker.add(index);
			hm.put(index++, "king");
			poker.add(index);
			hm.put(index++, "KING");
			
			//System.out.println(poker);
			//System.out.println(poker.size());
			
			Collections.shuffle(poker);//ϴ��
			
			//System.out.println(poker);
			//����
			TreeSet<Integer> p1 = new TreeSet<>();
			TreeSet<Integer> p2 = new TreeSet<>();
			TreeSet<Integer> p3 = new TreeSet<>();
			TreeSet<Integer> p4 = new TreeSet<>();
			for(int i = 0;i < 54  ;i++)
			{
				if(i >= poker.size() - 3)
				{
					p4.add(poker.get(i));
				}else if(i % 3 == 0)
				{
					p1.add(poker.get(i));
				}else if(i % 3 == 1)
				{
					p2.add(poker.get(i));
				}else if(i % 3 == 2)
				{
					p3.add(poker.get(i));
				}
			}
			look(hm,p1,"p1");
			look(hm,p2,"p2");
			look(hm,p3,"p3");
			look(hm,p4,"p4");
			
		
			
		
	}
	public static void look(HashMap<Integer,String>hm,TreeSet<Integer> ts,String name) {
		System.out.println(name + "������:");
		for(Integer o:ts)
		{
			System.out.print(hm.get(o)+" ");
		}
		System.out.println();
		return;
	}

}
