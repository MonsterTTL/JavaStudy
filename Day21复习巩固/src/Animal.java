
public class Animal {
	public static void main(String[] args)
	{
		method(new Cat());
		method(new Dog());
		
	}
	public static void method(AnimalM a)
	{
		a.eat();
	}

}

class AnimalM{
	public void eat()
	{
		System.out.println("����Է�");
	}
}

class Cat extends AnimalM{
	public void eat()
	{
		System.out.println("è����");
	}
}

class Dog extends AnimalM{
	public void eat()
	{
	  System.out.println("������");
	}
}
