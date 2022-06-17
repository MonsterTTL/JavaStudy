import java.util.HashSet;
import java.util.Random;

public class Demo2 {
	public static void main(String[] args) {
		Random one = new Random();
		HashSet<Integer> use  = new HashSet<>();//无重复的数据
		while(use.size()<20)
		{
			use.add((int)(Math.random()*25));
		}
		System.out.println(use);
	}
}
