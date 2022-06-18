import java.util.ArrayList;
import java.util.Collections;

public class Demo6_Collect {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("e"); 
		list.add("b"); 
		list.add("g"); 
		list.add("d");
		list.add("a");
		list.add("c");
		Collections.sort(list);//静态方法，排序
		//list.sort();比较器排序
		System.out.println(list);
		//System.out.println(Collections.binarySearch(list, "a"));//二分查找,需要有序
		System.out.println(Collections.max(list));//获取最大值
		Collections.reverse(list);//反转
		System.out.println(list);
		Collections.shuffle(list);//随机交换（洗牌）
		System.out.println(list);
	}

}
