import java.util.Scanner;

public class Shoppinglist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many items do you want to get?: ");
        int x = scan.nextInt();
        String[] list = new String[x];
        for(int i = 0; i<x; i++){
            System.out.println("What item do you want to get? ");
            list[i] = scan.next();
            
        }
        System.out.println("your list is:");
        for(int i = 0; i<x; i++){
            System.out.println(list[i]);
        }

    }
}