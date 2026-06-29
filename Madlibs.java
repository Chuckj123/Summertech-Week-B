import java.util.Scanner;
public class Madlibs{
    public static void main(String[]args){
       Scanner scan = new Scanner (System.in);
        System.out.print("Enter a place: ");
        String noun = scan.next();
        System.out.print("Enter a adjective: ");
        String adjective = scan.next();
        System.out.print("Enter another noun: ");
        String noun2 = scan.next();
        System.out.print("Enter a past tense verb: ");
        String verb = scan.next();

        System.out.println("This is your story: One day you were walking in " + noun + " and you saw a very " + adjective + " " + noun2 + " and then you " + verb + "it");

        System.out.println();    
    }
}