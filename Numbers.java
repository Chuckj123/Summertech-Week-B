import java.util.Scanner;
public class Numbers{
    public static void main (String[]args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Choose a number: ");
      int width = scan.nextInt();
      System.out.print("Choose another number:");
      int length = scan.nextInt();
      for(int y = 0; y<length; y+=1){
        for(int i = 0; i<width; i++){
          System.out.print("*  ");
        }
        System.out.println("");
        
       }
    // System.out.print("Choose a number: ");
    // int width = scan.nextInt();
    //   for (int i = 1; i <=width; i++ ){
    //     System.out.println(" ");
    //     for(int y = i; y>0; y--){
    //       System.out.print("* ");
    //     }
    //   }
      }
}