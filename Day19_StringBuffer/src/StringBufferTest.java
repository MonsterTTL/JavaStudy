
public class StringBufferTest {
	public static void main(String[] args)
	{
		StringBuffer one = new StringBuffer();//�ղι���
		StringBuffer two = new StringBuffer(32);//ָ��������С�Ĺ���
		StringBuffer three = new StringBuffer("Hello");//ָ����ʼ�ַ����Ĺ���
		
		one.append("The");//�������
		two.append("World");
		String show = three.toString()+one.toString()+two.toString();//StringBuffer��д��toString����
		System.out.println(show);
		
		three.insert(0, " The ");//�����������ͷ����ʼ����
		three.insert(0, "World");
		System.out.println(three);
		
		
		
		
	}
	
	public static void ShowSbInf(StringBuffer sb)
	{
		System.out.println("===========================");
		System.out.println("The number of chars: " + sb.length());//�����е��ַ�����
		System.out.println("The real capacity is :" + sb.capacity());//�����е�ʵ������
		System.out.println("===========================");
	}

}
