import java.util.Scanner;
public class Connect4 {
    public static void main(String[]args){
        char[][] board = new char[6][7]; 
        boolean game = true;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<=5; i++){
            for(int x = 0; x<=6; x++){
                board[i][x] = '_';
            }
        }
        while(game == true){
            Connect4.printBoard(board);
            System.out.println("It is player X turn, what column do you want to go?");
            int column = scan.nextInt();
        }
        
        
    }
    public static void printBoard(char[][] board){
        for(int i = 0; i<=5; i++){
            for(int x = 0; x<=6; x++){
               System.out.print(board[i][x]+ " ");
            }
            System.out.println(" ");
        }
    }
}
