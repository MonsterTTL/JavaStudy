import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
	public static void main(String[]args) throws ReflectiveOperationException
	{
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a class name:");
		name = in.next();
		
		
		Class cl = Class.forName(name);
		Class supercl = cl.getSuperclass();//ªÒ»°≥¨¿‡
		String modifiers = Modifier.toString(cl.getModifiers());
		System.out.print(modifiers + " ");
		System.out.print("class "+ name);
		if(supercl != null && supercl != Object.class )
			System.out.print(" extends "+supercl.getName());
		
		System.out.print("\n{\n");
		printConstructors(cl);
		System.out.println();
		printMethods(cl);
		System.out.println();
		printFields(cl);
		System.out.println("}");
		
	}


public static void printConstructors(Class cl)
{
	Constructor[] constructors = cl.getConstructors();
	
	for(Constructor c: constructors)
	{
		String name = c.getName();
		System.out.print("   ");
		String modifiers = Modifier.toString(c.getModifiers());
		System.out.print(modifiers + " ");
		System.out.print(name + "(");
		
		Class[] paramTypes = c.getParameterTypes();
		for(int i = 0;i < paramTypes.length;i++)
		{
			if(i > 0)System.out.print(", ");
			System.out.print(paramTypes[i].getName());
		}
		System.out.println(");");
	}
}

public static void printMethods(Class cl)
{
	Method[] methods = cl.getMethods();
	
	for(Method m:methods)
	{
		Class retType = m.getClass();
		String name = m.getName();
		
		System.out.print("   ");
		
		String modifiers = Modifier.toString(m.getModifiers());
		System.out.print(modifiers + " ");
		System.out.print(retType.getName() + " " + name +"(");
		
		Class[] paramTypes = m.getParameterTypes();
		for(int j = 0;j < paramTypes.length;j++)
		{
			if(j > 0 )System.out.print(", ");
			System.out.print(paramTypes[j].getName());
		}
		System.out.println(");");
 	}
}

public static void printFields(Class cl)
{
	Field[] fields = cl.getFields();
	
	for(Field f : fields)
	{
		Class type = f.getType();
		String name = f.getName();
		System.out.print("   ");
		String modifiers = Modifier.toString(f.getModifiers());
		System.out.print(modifiers + " ");
		System.out.println(type.getName()+" "+ name + ";");
	}
}

}

