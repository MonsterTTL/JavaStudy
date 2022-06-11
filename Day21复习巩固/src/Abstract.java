
public class Abstract {
	public static void main(String[] args)
	{
		People one = new Man();
		one.talk();
		one = new Woman();
		one.talk();
	}

}
//抽象类中可能没有抽象方法，但是由抽象方法的类一定是抽象类或者接口
//抽象类无法被实例化，但是可以引用子类
abstract class People{
	String name;
	int age;
	public abstract void talk();
}
//抽象类的成员变量既可以是变量，也可以是常量，但是abstract 不能修饰成员变量
//成员方法既可以是抽象的，也可以是具体的
//abstract && static 不能组合  -- 没有意义
//abstract && final 不能组合  -- 不能重写
//abstract && private 不能组合 -- 不能继承
class Man extends People{
	public void talk()
	{
		System.out.println("Man Talk");
	}
}

class Woman extends People{
	public void talk()
	{
		System.out.println("Woman Talk");
	}
}
