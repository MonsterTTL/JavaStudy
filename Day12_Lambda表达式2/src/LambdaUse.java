
public class LambdaUse implements IntCunt {
	public void accept(int value)
	{
		System.out.print(value);
	}
	
	public static void repeat(int n,IntCunt action)
	{
		for(int i = 0;i < n;i++)
			action.accept(i);
	}
	

}
