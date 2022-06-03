import java.io.StringWriter;

public class Pair<T> {
	private T first;
	private T second;
	Pair()
	{
		first = null;
		second = null;
	}
	Pair(T first,T second)
	{
		this.first = first;
		this.second = second;
	}
	
	public T getFirst()
	{
		return first;
	}
	public T getSecond()
	{
		return second;
	}
	
	public void setFirst(T first)
	{
		this.first = first;
	}
	
	public void setSecond(T second)
	{
		this.second = second;
	}
	
	public String toString()
	{
		StringWriter one = new StringWriter();
		one.write("The max is: "+ first);
		one.write(" And min is  :"+second);
		return (one.toString());
	}

}
