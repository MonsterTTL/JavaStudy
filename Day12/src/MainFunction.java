import java.util.Arrays;

public class MainFunction {
	public static void main(String[] args)
	{
		Dog[] one = new Dog[5];
		one[0] = new Dog("wof",4,10);
		one[1] = new Dog("aof",5,15);
		one[2] = new Dog("lof",3,20);
		one[3] = new Dog("LLof",2,25);
		one[4] = new Dog("Wlof",7,30);
		Dog[] three = one.clone();//克隆
		Arrays.sort(one);
		for(Dog use:one)
		{
			System.out.println(use);
		}
		System.out.println();
		String[] two = {"bsjdbsajd","sdadas","aaaaaaaaaaaaaa","sdahj"};
		
		Arrays.sort(two,new CompareFunction());//利用比较器进行比较
		
		for(String use:two)
		{
			System.out.println(use);
		}
		System.out.println();
		for(Dog use:three)
		{
			System.out.println(use);
		}
		
		
	}

}
