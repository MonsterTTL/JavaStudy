import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
//���׵��ļ���д
public class MainFunction {
	public static void main(String [] args) throws IOException
	{
		Student one = new Student();
		Scanner helper = new Scanner(System.in);
		Scanner filehelper = new Scanner(Path.of("stu.txt"));
		
		
		System.out.println("Do you want to update the file?");
		String flag = "";
		String temp = "";
		flag = helper.nextLine();
		if(flag.equals("1"))
		{PrintWriter writehelper = new PrintWriter("stu.txt",StandardCharsets.UTF_8);//һ���򿪱�����ԭ����
		System.out.println("please enter your usename: ");
		temp = helper.nextLine();
		one.setName(temp);
		writehelper.println("Name: "+temp);
		
		System.out.println("please enter your age: ");
		temp = helper.nextLine();
		one.setAge(Integer.parseInt(temp));
		writehelper.println("Age: " + temp);
		
		System.out.println("please enter your StudentNumber: ");
		temp = helper.nextLine();
		one.setStudentNumber(Integer.parseInt(temp));
		writehelper.println("StudentNumber: " + temp);
		
		writehelper.close();
		}
		else
		{
			
			System.out.println("Here is your Information:");
			temp = filehelper.nextLine();
			System.out.println(temp);
			temp = filehelper.nextLine();
			System.out.println(temp);
			temp = filehelper.nextLine();
			System.out.println(temp);
		}
		
		
	}

}
