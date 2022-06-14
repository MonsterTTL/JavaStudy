
public class GenDemo3 {
	public static void main(String[] args) {
		
	}

}

interface inner<T>{
	public void show(T t);
}
//两种方法实现泛型接口
class Demo implements inner<String>{
	public void show(String a)
	{
		
	}
	
}

class DemoG<T> implements inner<T>{
	public void show(T a)
	{
		
	}
}
