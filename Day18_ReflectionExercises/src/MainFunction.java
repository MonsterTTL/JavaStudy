import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//请用反射获得Arrays的sort方法并调用，要求逆序排序：
public class MainFunction {
	public static void main(String[] name) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{   
		Class cls = Arrays.class;
		Method method = cls.getDeclaredMethod("sort",int[].class);
		int[] arr = new int[10];
		initArr(arr);
		
		System.out.println(Arrays.toString(arr));
		method.invoke(Arrays.class, arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
	    reverse(arr);
	    System.out.println(Arrays.toString(arr));
		
	}
	
	public static void initArr(int[] arr)
	{
		int n = arr.length;
		for(int i = 0;i < n;i++)
		{
			arr[i] = (int)(Math.random()*50);
		}
		return;
		
	}
	
	public static void reverse(int[] arr)
	{
		int n = arr.length;
		int temp;
		for(int i = 0; i < n/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
	}
	
	

}
