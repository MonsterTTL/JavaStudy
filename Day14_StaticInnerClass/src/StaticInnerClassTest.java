
public class StaticInnerClassTest {
	public static void main(String[] args)
	{
		int[] martin = {11,20,50,11,19,26,-1,900,1900};
		Pair show = Pair.maxmin(martin);
		ArrayAlg.Pair show2 = ArrayAlg.Pair.maxmin(martin);
		System.out.print(show.getMax() + "   ");
		System.out.println(show.getMin());
		System.out.print(show2.getMax() + "   ");
		System.out.println(show2.getMin());
	}

}
