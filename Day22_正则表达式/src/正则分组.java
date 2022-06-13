import java.util.Arrays;

public class 正则分组 {
	public static void main(String[] args) {
		//叠词 
		String regx = "(.)\\1(.)\\2";//第一组，\\1代表第一组又出现一次
									 // \\2代表第二组又出现一次
		System.out.println("  乐乐".matches(regx));
		
		regx = "(..)\\1";
		System.out.println("乒乓乒乓".matches(regx));
		
		String s2 = "我我....要...要.......要.学....学学...编.....编..程...程";
		String s3 = s2.replaceAll("\\.+", "");//把..去掉
		System.out.println(s3);
		String s4 = s3.replaceAll("(.)\\1+", "$1");//$1代表第一组中的内容
		System.out.println(s4);
		
	}

}
