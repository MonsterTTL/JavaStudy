import java.util.ArrayList;

public class TOArrayDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		String[] arr = list.toArray(new String[0]);//如果实际长度大于指定的长度，自动扩充
		for(String a:arr)
		{
			System.out.println(a);
		}
	}

}
