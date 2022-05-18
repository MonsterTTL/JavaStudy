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

        int [] locations = {randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean IsAlive = true;

        while(IsAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkyourself(guess);
            numOGuess ++;
            if(result.equals("kill"))
            {
                IsAlive = false;
                System.out.println("You took "+numOGuess+" guesses");
            }
        }
    }
}
