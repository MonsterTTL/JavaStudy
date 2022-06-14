
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
	
	public <T> void Show(T one)
	{
		System.out.println(one.toString());
	}
	//自己有自己的泛型
	public static<T> void print(T a)//静态方法跟着类的加载而加载，所以需要先声明自己的泛型
	{
		System.out.println(a);
	}
}
