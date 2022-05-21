
public class MainFunction {
	public static void main(String arg[])
	{
		Dog one = new Dog("走司机",10,100,100);
		Cat two = new Cat("小走司机",5,100,100);
		one.bark();
		one.ShowInformation();
		two.bark();
		two.ShowInformation();
		one.setAge(5);
		two.setAge(10);
		one.bark();
		one.ShowInformation();
		two.bark();
		two.ShowInformation();
	}

}
