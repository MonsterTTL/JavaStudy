import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
//		TreeSet<String> one = new TreeSet<String>(new Comparator<String>() {
//			
//			public int compare(String o1, String o2) {
//				   return o1.length()-o2.length();
//			}});
		TreeSet<String> one = new TreeSet<String>((String o1,String o2)->o1.length()-o2.length());
		//以Comparator接口来比较
		//Lambda表达式实现
		
		one.add("sdsf");
		one.add("sdsfdsad");
		one.add("dsf");
		one.add("sasdccbnhgnhnsf");
		System.out.println(one);
		
	}
}


