import java.util.LinkedList;
import java.util.List;

public class suanFati {
	public static void main(String[] args) {
		String s = "cars";
		LinkedList<String> wordDict = new LinkedList<String>();
		wordDict.add("car");
		wordDict.add("ca");
		wordDict.add("rs");
		StringBuilder help = new StringBuilder(s);
		int i = 0;
		wordDict.sort((String o1,String o2)-> o1.length() - o2.length());
		while(help.length()>= 0 && i < wordDict.size())
		{
			if(help.toString().contains(wordDict.get(i)) == true)
			{
				int loc = help.indexOf(wordDict.get(i));
				int n = wordDict.get(i).length();
				//System.out.println(loc +" " + n);
				help.delete(loc, loc+n);
				i = 0;
				//System.out.println(help);
				continue;
			}
			i++;
		}
		boolean ret ;
		System.out.println(help);
		//System.out.println(help.length());
		if(help.length() == 0)
			ret = true;
		else
			ret = false;
		System.out.println(ret);
	}

}
