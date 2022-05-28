import java.util.Comparator;
//±È½ÏÆ÷
public class CompareFunction implements Comparator<String>{
	public int compare(String f1,String f2)
	{
		return (f1.length() - f2.length());
	}
	

}
