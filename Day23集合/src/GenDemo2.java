
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
	//�Լ����Լ��ķ���
	public static<T> void print(T a)//��̬����������ļ��ض����أ�������Ҫ�������Լ��ķ���
	{
		System.out.println(a);
	}
}
