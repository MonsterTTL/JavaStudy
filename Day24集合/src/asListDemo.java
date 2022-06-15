import java.util.Arrays;
import java.util.List;

public class asListDemo {
	public static void main(String[] args) {
		//数组转集合
		String[] arr = {"aa","bb"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		//list.add("ddd");  //数组转集合不支持更改
		//但可以用其他方法
		System.out.println(list);
		int[] arr2 = {11,22,55,66,77};
		List<?> list2 = Arrays.asList(arr2);
		System.out.println(list2);
		Integer[] arr3 = {11,22,55,66,77};
		List<?> list3 = Arrays.asList(arr3);
		System.out.println(list3);
		
		//List<int[]> list2 = Arrays.asList(arr2);  基本数据类型的数组转换成集合，会将整个数组当作一个对象存储
	}
}
