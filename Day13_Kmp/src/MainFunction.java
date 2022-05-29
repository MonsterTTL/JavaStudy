import java.util.Arrays;

public class MainFunction {
	public static void main(String[] args)
	{
		String father = "sasdsadasababaaabasdas";
		String son = "ababaaaba";
		//int result =TheKmp.Index1(father, son, 0);
		//int result2 = TheKmp.Index2(father, son, 0);
		//System.out.println(result);
		//System.out.println(result2);
		String test = "aaaaaaaaab";
		System.out.println(Arrays.toString(TheKmp.getNext(test)));
	    System.out.println(Arrays.toString(TheKmp.getNext2(test)));
	    
	    
	}
}
