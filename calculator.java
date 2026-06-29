import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        boolean thing = true;
        Scanner scan = new Scanner(System.in);
        while(thing == true){
            System.out.print("Enter a number: ");
            double input = scan.nextDouble();

            System.out.print("Enter another number: ");
            double input2 = scan.nextDouble();

            System.out.print("What operation do you want to do? Type quit to quit: ");
            String test = scan.next();


            if(test.equals("+")||test.equals("add")) {   
                double inputResult = input + input2;
                System.out.println("The result is: " + input + " + " + input2 + "= " + inputResult);
            }
            else if(test.equals("-")|| test.equals("minus")|| test.equals("subtraction"))
                {
                    double inputResult = input - input2;
                    System.out.println("The result is: " + input + "-" + input2 + "=" + inputResult);
            }
            else if(test.equals("*")|| test.equals("multiplication")) {
                double inputResult = input*input2;
                System.out.println("The result is:" + input + "x" + input2 + "=" + inputResult);
            }
            else if (test.equals ("/")|| test.equals("division")){
                double inputResult = input/input2;
                System.out.println("The result is :" + input + "/" + input2 + "=" + inputResult);
            } 
            else if (test.equals("quit")){
                thing = false;
            }
            else{
                System.out.println("invalid");
            }
        }
    }
}
