import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjTest {
	public static void main(StringA[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object o1 = new Object();
		Object o2 = new Object();
		int hashcode2 = o2.hashCode();
		int hashcode = o1.hashCode();
		System.out.println(hashcode);
		System.out.println(hashcode2); //ctrl + alt + 下 向下复制一行
		
		Class cls = p.class;
		Method one = cls.getDeclaredMethod("print");
		var a = new p();
		//one.setAccessible(true);
		one.invoke(a);
		
	}
}


class p{
	private void print()
	{
		System.out.println("Hello World");
	}
}
