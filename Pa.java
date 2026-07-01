import java.util.Scanner;
public class Pa{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String x = scan.nextLine();
        x = x.replaceAll(" ","");
        String y = "";
        for(int i = x.length()-1; i>=0; i--){
            x.charAt(i);
            y+=x.charAt(i);
            
        }
        
        System.out.println(y);
        System.out.println(x);

        if(y.equals (x)){
            System.out.println("Your word is a palindrome");
        }
        else{
            System.out.println("your word is not a palindrome");
        }
    }
}