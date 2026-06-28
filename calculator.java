import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double input = scan.nextDouble();

        System.out.print("Enter another number: ");
        double input2 = scan.nextDouble();

        System.out.println("What operation do you want to do?");

        double inputResult = input + input2;
        System.out.println("The result is: " + input + " + " + input2 + "= " + inputResult);

    }
}