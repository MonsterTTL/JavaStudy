
public class GenDemo2 {
	public static void main(String[] args) {
		Tools<String> one = new Tools<>("Hello");
		System.out.println(one.getInfor());
		one.Show("Hel");
		Tools.print("Haslo");
		
	}

}

class Tools<T>{
	T infor;
	Tools(T infor)
	{
		this.infor = infor;
	}
	
	public String getInfor()
	{
		return infor+" ";
	}
	
	public <T> void Show(T one)//自己的泛型，此处的泛型和类的泛型不一致
	{
		System.out.println(one.toString());
	}
	//自己有自己的泛型
	public static<T> void print(T a)//静态方法跟着类的加载而加载，所以需要先声明自己的泛型，因为类的泛型在创建对象时赋值
	{
		System.out.println(a);
	}
}
