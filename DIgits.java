import java.util.Scanner;
public class DIgits{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.println(zero(x));
   
     
    }
    public static int zero(int x){
         boolean trues = true;
        int counter = 0;
        
        if(x==0){
            return x+=1;
        }
        
        else{
            while(trues = true){
                x = x/10;
                counter++;
                if (x==0){
                    return counter;
                }
            }
        }

        return -1;
    }
}