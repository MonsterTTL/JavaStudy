import java.util.Arrays;

public class ArraysTest {
	//����ת�ַ���Arrays.toString
	//��������Arrays.sort
	//������ֲ���Arrays.binarySearch ��Ҫ��������
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		ArrReverse(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.binarySearch(arr1, 9));
	}
	
	public static void ArrReverse(int[] arr)
	{
		int n = arr.length;
		int temp = 0;
		for(int i = 0;i < n/2;i++)
		{
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		return;
	}

}
