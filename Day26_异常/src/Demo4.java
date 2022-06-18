//万物皆对象 -- 包括异常
public class Demo4 {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(-17);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	

}

class Person {
	private String name;
	private int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) throws Exception
	{
		if(age > 0 && age <= 150)
			this.age = age;
		else {
			System.out.println("FuckYou!");
			throw new Exception("非法年龄");
		}
			
	}
	
}
