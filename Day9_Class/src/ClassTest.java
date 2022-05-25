
public class ClassTest {
	public static void main(String[]args) throws ClassNotFoundException
	{
		String one = new String("java.util.Random");
		Class two = Class.class;
		Class three = Class.forName(one);
		System.out.println(one.getClass() + "  " + one);
		System.out.println(three);
		System.out.println(two);
		
		String name = "java.util.String";
		Class cl = Class.forName(name);
		Object obj = cl.getConstructor().newInstance();
	}

}
