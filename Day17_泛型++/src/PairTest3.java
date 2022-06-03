import inheritance.Manager;

public class PairTest3 {
	public static void main(String[] args)
	{
		var ceo = new Manager("Gus Geedy",800000,2003,12,15);
		var cfo = new Manager("Sid Snakey",600000,2003,12,15);
		var builder = new Pair<Manager>(ceo,cfo);
	}

}
