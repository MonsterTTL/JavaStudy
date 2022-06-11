
public class SuperMan {
	public static void main(String[] args) {
		Person p = new Super_Man();//����ת��
		System.out.println("I'm "+p.name);
		p.talk();
		Super_Man two = (Super_Man)p;//����ת��
		
		
		two.fly();
	}

}

class Person{
	String name = "John";
	public void talk()
	{
		System.out.println("Talk");
	}
}

class Super_Man extends Person{
	String name = "SuperMan";
	public void talk()
	{
		System.out.println("Big Talk");
	}
	
	public void fly()
	{
		System.out.println("Fly and Save");
	}
}
