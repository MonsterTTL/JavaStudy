import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ½ø½× {
	public static void main(String[] args) {
		String reg = "(\\b.+?OS)";
		String OS = "MACOS LINUXOS WINDOS";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(OS);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		
		
	
	}

}
