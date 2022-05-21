
public class Student extends Person {
	
	public Student(String name)
	{
		super(name);
	}
	
	public String getDescription()
	{
		String ret = new String("Hello,Im a Student!My name is " + this.getName());
		return ret;
	}

}
