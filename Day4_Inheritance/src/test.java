
public class test {
    
    
	public static void main(String [] arg)
	{   String a = "HelloWorld";
		a = a.replace("Hello", "FuckThe");
		boolean flag = a.startsWith("FuckThe");
		//a = a.toUpperCase();
		System.out.println(a + " " + flag);
		
		StringBuilder help = new StringBuilder();
		help.append("FM ");
		help.append("86.6");
		String show = help.toString();
		System.out.println(show);
		help.insert(2, "Super ");
		show = help.toString();
		System.out.println(show);
		//int cp = a.codePointAt(i);
		//if(Character.isSupplementaryCodePoint(cp))
		//	i += 2;
		//else
		//	i++;
		
	}
}
