import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainFunction {
	public static void main(String[] args) {
		String app = "cbacdcbc";
		char[]arr = app.toCharArray();
		Arrays.sort(arr);
		StringBuilder help = new StringBuilder();
		LinkedHashSet<Character> use = new LinkedHashSet<>();
		for (char c: arr) {
			use.add(c);
		}
		for (Character character : use) {
			help.append(character);
		}
		System.out.println(help);
		
	}
}
