
public class mainfunction {
	public static void main(String[] args)
	{
		outer Outer = new outer();
		Outer.display(10);
	}

}

class outer {
	private int nums = 5;
	public void display(int temp)
	{     
		class Innter{
			
			public void fun() {
				System.out.println(nums);
				
				
			}
		}
		Innter a = new Innter();
		a.fun();
		temp++;
		a.fun();
		System.out.println(temp);
	}

}

