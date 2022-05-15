public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();

    public void startGame() {



        int guseep1 = 0;
        int guessp2 = 0;

        boolean p1isright = false;
        boolean p2isright = false;

        int realtarget = (int) (Math.random() * 20);
        System.out.println("I'm thinking number 1 - 20");

        while (true) {
            p1.guess();
            p2.guess();

            guseep1 = p1.choice;
            System.out.println("Player1 is guessing " + guseep1);

            guessp2 = p2.choice;
            System.out.println("Player2 is guessing " + guessp2);

            if (guseep1 == realtarget) {
                p1isright = true;
            }
            if (guessp2 == realtarget) {
                p2isright = true;
            }

            if (p1isright || p2isright) {
                System.out.println("We have Winner !");
                if (p1isright) {
                    System.out.println("Player1 is win with true number " + guseep1);
                }
                if (p2isright) {
                    System.out.println("Player2 is win with true number " + guessp2);
                }
                System.out.println("Game Over!");
                break;
            } else {
                System.out.println("But i'm thinking "+ realtarget);
                System.out.println("Let's Try again!");
                realtarget = (int)(Math.random() * 20);
            }


        }
    }
}
