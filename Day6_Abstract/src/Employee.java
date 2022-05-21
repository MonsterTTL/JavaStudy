
public class Employee extends Person {
	
	public Employee(String name)
	{
		super(name);
	}

	public String getDescription()
	{
		String ret = new String("Hello,Im a Employee.My name is "+this.getName());
		return ret;
	}
}
