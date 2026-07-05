import java.util.Scanner;
public class Celsius{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a fahrenheit number degrees");
        double input = scan.nextDouble();
        System.out.println(celsius(input));
    }
    public static double celsius(double f){
        double output = (f-32)*(5.0/9);
        return output;
    }
}