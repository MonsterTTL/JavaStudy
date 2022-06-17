import java.util.TreeSet;

//TreeSet是对元素进行排序的
//保证元素唯一
//依靠comparable接口
//compareTo 正 怎么存怎么取  右边
//compareTo 负数  倒序 左边
//compareTo 0 不存
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<Integer> temp = new TreeSet<>();
		temp.add(2);
		temp.add(9);
		temp.add(3);
		temp.add(4);
		temp.add(6);
		System.out.println(temp);
	}

}

class non implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
