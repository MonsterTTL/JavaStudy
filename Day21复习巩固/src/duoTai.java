//A.多态(polymorphic)
// 事物存在的多种形态

//B.多态前提
//1.要有继承关系
//2.有方法重写
//3.要有父类引用指向子类对象
public class duoTai {
	public static void main(String[] args)
	{
		AnimalZ one = new Catz();//父类引用指向子类对象
		//编译时指向的是父类的方法，但是运行时运行的是子类的方法（动态绑定）
		Catz two = (Catz)one;
		one.eat();
		System.out.println(one.num);// 只指向整个Cat中的super区
		System.out.println(two.num);// 指向了整个Cat中的整个
		
	}

}

class AnimalZ{
	int num = 10;
	public void eat()
	{
		System.out.println("动物吃饭");
	}
}

class Catz extends AnimalZ{
	int num = 20;
	public void eat()
	{
		System.out.println("猫吃鱼");
	}
}