import java.util.ArrayList;

public class SimpleDotComTestDrive {
   /* public static void main(String []arg)
    {
        SimpleDotCom one = new SimpleDotCom();
        int[] location = {2,3,4};
        one.setLocationCells(location);
        String guess = "5";
        String result = one.checkyourself(guess);
    }
    */
    public static void main(String[] arg){
        int numOGuess = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum =(int)(Math.random() * 5);
        ArrayList<String> list = new ArrayList<String>();
        String temp = "" + randomNum;
        list.add(temp);
        temp = "" + (randomNum+1);
        list.add(temp);
        temp = "" + (randomNum+2);
        list.add(temp);
        //int [] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(list);
        boolean IsAlive = true;

        while(IsAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkyourself(guess);
            numOGuess ++;
            if(result.equals("kill"))
            {
            	System.out.println("Kill");
                IsAlive = false;
                System.out.println("You took "+numOGuess+" guesses");
            }
            else if(result.equals("hit"))
            {
            	System.out.println("hit");
            }
            else if(result.equals("miss"))
            {
            	System.out.println("miss");
            }
        }
    }
}
