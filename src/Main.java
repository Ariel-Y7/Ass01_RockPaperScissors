import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {

            String playerA = "";
            String playerB = "";
            boolean done = false;


            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = in.nextLine().toUpperCase();

                if (playerA.equals("R") || playerA.equals("P") || playerA.equals("S")) {
                    done = true;
                } else {
                    System.out.println("Invalid Move: " + playerA);
                    System.out.println("Try again,");
                }
            } while (!done);


            done = false;

            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = in.nextLine().toUpperCase();

                if (playerB.equals("R") || playerB.equals("P") || playerB.equals("S")) {
                    done = true;
                } else {
                    System.out.println("Invalid Move: " + playerB);
                    System.out.println("Try again,");
                }

            } while (!done);

            if (playerA.equals(playerB)) {
                System.out.println("Both players chose " + playerA + " - it's a tie!");
            } else if (playerA.equals("R") && playerB.equals("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");
            } else if (playerA.equals("P") && playerB.equals("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            } else if (playerA.equals("S") && playerB.equals("P")) {
                System.out.println("Scissors cut Paper - Player A wins!");
            } else if (playerB.equals("R") && playerA.equals("S")) {
                System.out.println("Rock breaks Scissors - Player B wins!");
            } else if (playerB.equals("P") && playerA.equals("R")) {
                System.out.println("Paper covers Rock - Player B wins!");
            } else if (playerB.equals("S") && playerA.equals("P")) {
                System.out.println("Scissors cut Paper - Player B wins!");
            }


            System.out.print("Do you want to play again? (y/n): ");
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                playAgain = false;
                System.out.println("Thanks for playing!");

            }
        }
    }
}