import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int score = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("How old is Lucas: ");
        int age = scan.nextInt();
        if (age == 16) {
            System.out.println("You got it correct!");
            score += 1;
        } else {
            System.out.println("you got it incorrect");
        }
        System.out.print("How tall is Lucas: ");
        String height = scan.next();

        if (height.equals("4'2") || height.equals("152")) {
            System.out.println("you got it correct");
            score++;
        } else {
            System.out.println("you got it incorrect");
        }
        System.out.println("Your score is " + score + "/2");
        
    }
}