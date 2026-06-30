import java.util.Scanner;
public class Fibonacci{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers of the sequence do you want? ");
        int x = scan.nextInt();
        int[] sequence = new int[x];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i<x; i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        for(int i = 0; i<x; i++){
            System.out.println(sequence[i]);
        }

    }
}