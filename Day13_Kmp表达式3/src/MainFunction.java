import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args)
	{
		Person[] use = new Person[3];
		Scanner in = new Scanner(System.in);
		for(int i = 0;i < use.length;i++)
		{
			String tempname = in.next();
			String tempage = in.next();
			use[i] = new Person(tempname,Integer.parseInt(tempage));
		}
		for(Person e:use)
		{
			System.out.println(e);
		}
		Arrays.sort(use,Comparator.comparing(Person::getNameLength).thenComparing(Person::getAge));
		//后跟的thenComparing方法用来处理第一种比较相同的情况，若相同，再用thenComparing方法继续比较
		//可以套娃
		
		
		
		//Arrays.sort(use,Comparator.comparing(Person::getName));
		//该方法提取了一个getName方法，返回String，
		//而String可以比较，所以将Person映射为一个可以比较的类型(String)，并以String的Sort方法完成Person的排序
		//利用方法引用的特性
		for(Person e:use)
		{
			System.out.println(e);
		}
		
	}

}
