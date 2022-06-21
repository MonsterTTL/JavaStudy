
public class Demo6_Warp {
	public static void main(String[] args) {
		HeiMaStudent heima = new HeiMaStudent(new Student());
		heima.code();
	}
}

interface Coder{
	public void code();
}

class Student implements Coder{

	@Override
	public void code() {
		System.out.println("JavaSE");
		System.out.println("JavaWeb");
	}
	
}
//装饰设计模式   //好处：降低耦合性
class HeiMaStudent implements Coder{
	private Student s;  //1.获取被装饰类的引用
	public HeiMaStudent(Student s)  //2.在构造方法中传入被装饰类的对象
	{
		this.s = s;
	}
	
	public void code()//对原有功能进行升级
	{
		s.code();
		System.out.println("ssh");
		System.out.println("数据库");
		System.out.println("大数据");
		System.out.println("....");
	}
}
