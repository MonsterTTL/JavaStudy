
public class 正则替换 {
	public static void main(String[] args) {
		String s1 = "我1是2你";
		String re = "\\d";
		System.out.println(s1.replaceAll(re, ""));
	}

}
