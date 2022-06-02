
public class PairTest1 {
	public static void main(String[] args)
	{
		int[] testuse = {1,5,7,10,6,9,-5,20};
		String[] StringTest = {"Hello","The","World","How","Are","You?"};
		Pair<String> result2 
		= new Pair<>(ArrayAlg.maxmin(StringTest).getFirst(),ArrayAlg.maxmin(StringTest).getSecond());
		Pair<Integer> result = ArrayAlg.maxmin(testuse);
		System.out.println(result);
		System.out.println(result2);
	}

}
