import java.util.Arrays;

public class Packaged {
	public static void main(String[] args)
	{
		//int[] a = {12};
		//int[] b = {13};
		//swap(a,b);
		//System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
		//System.out.println(Integer.toHexString(a));//ת�˽���
		//System.out.println(Integer.toBinaryString(a));//ת������
		//String aString = Integer.toString(a);//����ת�ַ���
		//System.out.println(aString);
		//a = Integer.reverse(a);
		//System.out.println(Integer.toHexString(a));
		//System.out.println(Integer.toBinaryString(a));
		//int c = Integer.parseInt("999");//�ַ���ת����
		//int d = Integer.valueOf("9999");//�ַ�תת���֣�Integer��
		//System.out.println(c);
		//System.out.println(d);
		
		//�Զ�װ�䣬�ѻ�������תΪ��װ����
		//�Զ����䣺�Ѱ�װ����תΪ��������
		String s = "true";
		char[] ar =  s.toCharArray();
		for(char d:ar)
		{
			System.out.print(d+" ");
		}
		System.out.println();
		boolean a = Boolean.parseBoolean(s);
		System.out.println(a);
		Integer c = 127;
		Integer d = 127;
		swap(c,d);
		System.out.println(c);
		System.out.println(c == d);
		
	}
	
	public static void swap(Integer a,Integer b)
	{
		int temp = a;
		a = Integer.valueOf(b);
		b = temp;
		return;
		
	}

}
