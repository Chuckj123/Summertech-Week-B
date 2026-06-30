import java.util.Scanner;

import javax.swing.SpinnerDateModel;

import java.util.Random;
public class Numguessgame{
    public static void main(String[]args){
        int guess1 = 1;
        int guess2 = 10-guess1;
        Random random = new Random ();
        Scanner scan = new Scanner(System.in);
        int x = random.nextInt(1,101);
        while (guess1<=10.5){
            System.out.print("Guess a random number from 1-100 within 10 tries: ");
            int guess = scan.nextInt();
            if(guess == x){
                guess1 +=1;
                System.out.println("You got it correct! You got it in " + guess1 + " tries!");
                break;
            }
            else if (guess > x ){
                System.out.println("Your guess is higher than the number.You have " + (10-guess1) + " guesses left");
                guess1+=1;
            }
            else{
                System.out.println("Your guess is lower than the number. You have " + (10-guess1) + " guesses left");
                guess1 +=1;
            }
            if(guess1==11){
                System.out.println("You ran out of attempts. The number was " + x);
                break;
            }
        }
    }
}