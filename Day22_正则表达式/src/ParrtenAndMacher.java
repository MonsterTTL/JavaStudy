import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParrtenAndMacher {
	public static void main(String[] args) {
		String one = "�ҵĺ���15957293387����ǰ����13185471756";
		String regx = "1[3579]\\d{9}";
		
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(one);
		boolean b1 = m.find();//��������
		System.out.println(b1);
		String s1 = m.group();
		System.out.println(s1);
		m.find();
		System.out.println(m.group());
	}

}
