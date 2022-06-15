
public class GenDemo3 {
	public static void main(String[] args) {
		
	}

}

interface inner<T>{
	public void show(T t);
}
//两种方法实现泛型接口
class Demo implements inner<String>{//推荐这种
	public void show(String a)
	{
		
	}
	
}

class DemoG<T> implements inner<T>{//没有必要在实现接口时再加一个泛型
	public void show(T a)
	{
		
	}
}
