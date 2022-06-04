import inheritance.Employee;
import inheritance.Manager;

public class PairTest3 {
	public static void main(String[] args)
	{
		var ceo = new Manager("Gus Geedy",800000,2003,12,15);
		var cfo = new Manager("Sid Snakey",600000,2003,12,15);
		var builder = new Pair<Manager>(ceo,cfo);
		printBuilddies(builder);
		
		ceo.setBonus(1000000);
		cfo.setBonus(500000);
		Manager[] managers = {ceo,cfo};
		
		var result = new Pair<Employee>();
		minmaxBouns(managers,result);
		System.out.println("first : "+result.getFirst().getName()
				+ " second: "+result.getSecond().getName());
		maxminBouns(managers,result);
		System.out.println("first : "+result.getFirst().getName()
				+ " second: "+result.getSecond().getName());
	}
	public static void printBuilddies(Pair<? extends Employee>p)
	{
		Employee first = p.getFirst();
		Employee second = p.getSecond();
		
	}
	public static void minmaxBouns(Manager[] a,Pair<? super Manager> result)
	{
		if(a.length == 0)return;
		Manager min = a[0];
		Manager max = a[0];
		for(int i = 0;i < a.length;i++)
		{
			if(min.getBouns() > a[i].getBouns())
				min = a[i];
			if(max.getBouns() <= a[i].getBouns())
				max = a[i];
		}
		result.setFirst(min);
		result.setSecond(max);
	}
	
	public static void maxminBouns(Manager[] a,Pair<? super Manager>result)
	{
		minmaxBouns(a,result);
		PairAlg.swap(result);
	}
}
