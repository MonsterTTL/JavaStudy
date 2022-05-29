import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args)
	{
		Person[] use = new Person[3];
		Scanner in = new Scanner(System.in);
		for(int i = 0;i < use.length;i++)
		{
			String tempname = in.next();
			String tempage = in.next();
			use[i] = new Person(tempname,Integer.parseInt(tempage));
		}
		for(Person e:use)
		{
			System.out.println(e);
		}
		Arrays.sort(use,Comparator.comparing(Person::getNameLength).thenComparing(Person::getAge));
		//�����thenComparing�������������һ�ֱȽ���ͬ�����������ͬ������thenComparing���������Ƚ�
		//��������
		
		
		
		//Arrays.sort(use,Comparator.comparing(Person::getName));
		//�÷�����ȡ��һ��getName����������String��
		//��String���ԱȽϣ����Խ�Personӳ��Ϊһ�����ԱȽϵ�����(String)������String��Sort�������Person������
		//���÷������õ�����
		for(Person e:use)
		{
			System.out.println(e);
		}
		
	}

}
