import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt){
        String inputline = null;
        System.out.print(prompt+" ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputline = is.readLine();
            if (inputline.length() == 0) return null;
        }catch(IOException e){
            System.out.println("IOException: " + e);


        }
        return inputline;
    }
}
