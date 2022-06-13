
public class Regex {
	public static void main(String[] args) {
		String regex = "[0-9]{5,}\\d";
		System.out.println("a".matches(regex));
		System.out.println("123450".matches(regex));
		
		String s = "馒头 油条 包子";
		String[] arr = s.split(" ");//以空格为分割
		for(String a:arr)
		{
			System.out.println(a);
		}
		s ="馒头.油条.包子";
		arr = s.split("\\.");//需要转义,\\. == .
		for(String a:arr)
		{
			System.out.println(a);
		}
	}

}
