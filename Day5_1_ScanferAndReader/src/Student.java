public class Student {
	private String name = null;
	private int age = 0;
	private long StudentNumber = 0;
	
	public void setName(String NewName)
	{
		name = NewName;
	}
	
	public void setAge(int NewAge)
	{
		age = NewAge;
	}
	
	public void setStudentNumber( long number)
	{
		StudentNumber = number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public long getStudentNumber()
	{
		return StudentNumber;
	}

}
