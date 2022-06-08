
public class Fruit {
	double weight;
	String color;
	Fruit(double weight,String color)
	{
		this.weight = weight;
		this.color = color;
	}
	Fruit()
	{
		
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean equals(Fruit other)
	{
		if(this == other)
			return true;
		if(this.weight == other.weight)
		{
			if(this.color.equals(other.color))
			{
				return true;
			}
		}
		return false;
	}
	
	public int  hashCode()
	{
		String a = Integer.toString(this.color.hashCode())  ;
		a += weight;
		return Integer.parseInt(a);
	}
		
	

}
