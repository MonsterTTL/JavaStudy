import java.util.HashSet;

public class SetDemo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); //Set中没有重复元素
		boolean f1 = hs.add("a");	//Set集合无索引，不重复，存取不一致
		boolean f2 = hs.add("b");  //存储重复元素时返回false
		hs.add("b");				//没有重写toString,但他继承了父类的重写了的toString
		hs.add("d");
		hs.add("e");
		hs.add("f");
		
		System.out.println(f1);
		System.out.println(f2);  
		System.out.println(hs);
		for (String string : hs) {
			System.out.println(string);
		}
	}

}


