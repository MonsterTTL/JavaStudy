import java.util.LinkedList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		var list = new LinkedList();
		list.add("你");
		list.add("就");
		list.add("是");
		list.add("歌");
		list.add("姬");
		list.add("吧");
		list.add("!");
		
		System.out.println(list);
		var list2 = new LinkedList();
		list2.addFirst("你");//头部插入
		list2.addFirst("就");
		list2.addFirst("是");
		list2.addFirst("歌");
		list2.addFirst("姬");
		list2.addFirst("吧");
		list2.addFirst("!");
		System.out.println(list2);
		//list2.get(0);
		System.out.println(list2.getFirst().toString() + list2.getLast());//获取第一个和最后一个
		System.out.println(list.removeLast());//删除尾结点并返回被删除的对象值
		
	}

}
