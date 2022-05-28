
public class MainFunction {
	public static void main(String[] args)
		{
			var one = new LambdaUse();
			LambdaUse.repeat(10,one);
			System.out.println();
			
			LambdaUse.repeat(10,x -> {
				if(x >= 5)System.out.print(x);
			});
		
		}
	
}
