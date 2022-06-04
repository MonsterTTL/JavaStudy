import java.io.StringWriter;

public class MainFunction {
	 public static void main(String[] args)
	 {
		 char a = 'a';
		 char z = 'u';
		 System.out.println((int)a);
		 System.out.println((int)z);
		 StringWriter make = new StringWriter();
		 make.append((char)(a+3));
		 System.out.println(make.toString());
	 }
}
