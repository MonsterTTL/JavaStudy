
public class Regex {
	public static void main(String[] args) {
		String regex = "[0-9]{5,}\\d";
		System.out.println("a".matches(regex));
		System.out.println("123450".matches(regex));
		
		String s = "��ͷ ���� ����";
		String[] arr = s.split(" ");//�Կո�Ϊ�ָ�
		for(String a:arr)
		{
			System.out.println(a);
		}
		s ="��ͷ.����.����";
		arr = s.split("\\.");//��Ҫת��,\\. == .
		for(String a:arr)
		{
			System.out.println(a);
		}
	}

}
