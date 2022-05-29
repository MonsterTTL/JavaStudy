
public class TheKmp {
	public static int Index1(String father,String son,int location)
	{
		int leng1 = father.length();
		int leng2 = son.length();
		int p1 = location;int p2 = 0;
		while(p1 < leng1 && p2 < leng2)
		{
			if(father.charAt(p1) == son.charAt(p2))
			{
				p1++;p2++;
			}
			else
			{
				p1 = ++location;
				p2 = 0;
			}
		}
		if(p2 >= leng2-1)
		{
			return location;
		}
		else
		{
			return -1;
		}
	}
	
	public static int Index2(String father,String son,int startLocation)
	{
		int leng1 = father.length();int leng2 = son.length();
		int [] next = getNext(son);
		int i = startLocation;int j = 0;
		while(i < leng1 && j < leng2)
		{
			if(j == -1 ||father.charAt(i) == son.charAt(j))
			{
				i++;j++;
			}
			else
			{
				j = next[j];
			}
		}
		if( j >= leng2)
			return(i-leng2);
		else
			return -1;
		
	}
	
	public static int[] getNext(String son)
	{
		int n = son.length();
		int[]next = new int[n];
		int i = 0;int k = -1;
		next[0] = -1;
		while(i < n-1)
		{
			if(k == -1 || (son.charAt(i) == son.charAt(k)))
			{
				i++;k++;
				next[i] = k;
			}
			else
			{
				k = next[k];
			}
		}
		return next;
	}
	
	
	public static int[] getNext2(String temp)
	{
		int n = temp.length();
		int[] next = new int[n];
		next[0] = -1;int i = 1;int j = -1;
		while(i < n)
			if(j == -1||temp.charAt(i-1) == temp.charAt(j))next[i++] = ++j;
			else j = next[j];
		return next;
	}
		

}
