//实现了Comparable 接口，可以使用Arrays.sort方法
public class Dog implements Comparable<Dog>,Cloneable,bark {
	private String name;
	private int age;
	private int weight;
	Dog(String name,int age,int weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int weight()
	{
		return weight;
	}
	public int compareTo(Dog obj)
	{
		return (this.getAge() - obj.getAge());
	}
	public String getWolf()
	{
		if(age < 5)
			return "wolf~";
		else
			return "Aowu~";
	}
	public String toString()
	{
		String ret = "name: " + name +" age:"+age+" weight:"+weight;
		return ret;
	}
	public Dog clone()throws CloneNotSupportedException
	{
		Dog cloned = (Dog)super.clone();
		return cloned;
		
	}
	
}
