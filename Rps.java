import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        String thing3 = "not quit";
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while (thing3.equals("not quit")){
            int thing = rand.nextInt(3);
            System.out.print("Choose Rock, Paper, or Scissors, write your option with a capital letter or quit: ");
            String thing2 = scan.next();
            
            // 0 means rock, 1 means paper, 2 means scissors
            // ties
            if (thing == 0 && thing2.equals("Rock")) {
                System.out.println("It is a tie! You both choose rock!");
            }
            if (thing == 1 && thing2.equals("Paper")) {
                System.out.println("It is a tie! You both choose paper!");
            }
            if (thing == 2 && thing2.equals("Scissors")) {
                System.out.println("It is a tie! You both choose scissors!");
            }
            // losses for computer
            if (thing == 0 && thing2.equals("Paper")) {
                System.out.println("You won! It choose rock!");
            }
            if (thing == 1 && thing2.equals("Scissors")) {
                System.out.println("You won! It choose paper!");
            }
            if (thing == 2 && thing2.equals("Rock")) {
                System.out.println("You won! It choose scissors!");
            }
            // wins for computer
            if (thing == 0 && thing2.equals("Scissors")) {
                System.out.println("You lost! It choose rock!");
            }
            if (thing == 1 && thing2.equals("Rock")) {
                System.out.println("You lost! It choose paper!");
            }
            if (thing == 2 && thing2.equals("Paper")) {
                System.out.println("You lost! It choose scissors");
            }
            if (thing2.equals("quit")){
            thing3 = "quit";
            }

        }
    }
}