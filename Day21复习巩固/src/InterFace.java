
public class InterFace {
	public static void main(String[] args) {
		new demo().print();
		System.out.println(Inter3.num);
	}

}

//InterFace 
//成员变量，只能是常量，并且是静态且公共的
//建议手动给出常量
//成员方法，只能是抽象方法
//也可以是静态私有的，但是只能内部使用
//接口可以多继承
interface Inter{
	int num = 10;
	private static int Change()
	{
		return 10;
	}
	public static int Change2()
	{
		return 20;
	}
}

interface Inter2{
	int num = 20;
}

interface Inter3 extends Inter{
	
}

class demo implements Inter,Inter2{
	public void print()
	{
		System.out.println(Inter2.num);
	}
}
