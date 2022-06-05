import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException 
	{
		//1.forName方法
		
		Class cls = Class.forName("Person");
		//2.获取成员变量
		Field[] fields = cls.getFields();
		for(Field e:fields)
		{
			String name = e.getName();
			System.out.print(name + " ");
		}
		Field field  = cls.getField("name");
		Person people = new Person();
		Object value = field.get(people);
		System.out.println(value);
		field.set(people, "JKL");
		value = field.get(people);
		System.out.println(value);
		System.out.println("===================================");
		fields = cls.getDeclaredFields();
		for(Field e:fields)
		{
			
			System.out.println(e);
		}
		System.out.println("===================================");
		Constructor cons = cls.getConstructor(String.class,int.class);
		Constructor cons2 = cls.getConstructor();
		System.out.println(cons);
		Object pp = cons.newInstance("周哥",24);
		System.out.println(pp);
		Object pp2 = cons2.newInstance();
		System.out.println(pp2);
		pp2 = cls.newInstance();
		System.out.println(pp2);
		System.out.println("===================================");
		//System.out.println(int[].class);
		int[] top = {1,2,91,-4,-19,90,12};
		rsort(top);
		System.out.println(Arrays.toString(top));
		
	}
	
	public static void printCls(Class cls)
	{
		System.out.println(cls);
		System.out.print(Modifier.toString(cls.getModifiers()));
		System.out.print(" ");
		System.out.print(cls.getSimpleName());
		System.out.print(" ");
		System.out.print(Arrays.toString(cls.getInterfaces()));
		System.out.println(" ");
		Field field[] = cls.getFields() ;
		for(Field e:field)
		{
			String a = e.getClass().getName();
			System.out.println(a);
		}
	}
	
	public static void rsort(int[] arr) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Class cls = Arrays.class;
		Method method = cls.getDeclaredMethod("sort",int[].class );
		method.invoke(Arrays.class, arr);
		//method.invoke(arr);
	}
}
