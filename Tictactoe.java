import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                board[r][c] = '_';
            }
        }
        
    
        char turn = 'X';
        while (true) {
            boolean tie = true;
            for (int i = 0; i <= 2; i++) {
                for (int x = 0; x <= 2; x++) {
                    System.out.print(board[i][x] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("player " + turn + " turn");
            System.out.print("What row?: ");
            int row = scan.nextInt();
            System.out.print("What column");
            int column = scan.nextInt();
            row = row - 1;
            column = column - 1;
            if(row >2 || column>2||row<0||column<0){
                System.out.println("Your thing is out fo bounds try somtheing else");
            }
            
            else {
                if (board[row][column] == 'X' || board[row][column] == 'O') {
                    System.out.println("choose a different place");
                }
                else {
                    board[row][column] = turn;
                    if (turn == 'X') {
                        turn = 'O';
                    }
                    else {
                        turn = 'X';
                    }
                }
            }
            
            
            //horizontal
            if(board[0][0] == 'X' && board[0][1] == 'X'&& board[0][2] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            //horizontal 
            if(board[1][0] == 'X' && board[1][1] == 'X'&& board[1][2] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            //horizontal
            if(board[2][0] == 'X' && board[2][1] == 'X'&& board[2][2] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            //vertical 
            if(board[0][1] == 'X' && board[1][1] == 'X'&& board[2][1] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            if(board[0][0] == 'X' && board[2][0] == 'X'&& board[1][0] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            if(board[0][2] == 'X' && board[2][2] == 'X'&& board[1][2] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            //diagonal 
            if(board[0][0] == 'X' && board[1][1] == 'X'&& board[2][2] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
            if(board[0][2] == 'X' && board[1][1] == 'X'&& board[2][0] == 'X'){
                System.out.println("Player X wins");
                for(int i=0; i<=2; i++){
                    for(int x = 0; x<=2; x++){
                        System.out.print(board[i][x]+" ");
                    }
                    System.out.println(" ");
                }
                break;
            }
                    //horizontal
        if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        //horizontal
        if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        //horizontal
        if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        //vertical
        if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        if(board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        if(board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        //diagonal
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                }
                System.out.println(" ");
            }
            break;
        }

        if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
            System.out.println("Player O wins");
            for(int i=0; i<=2; i++){
                for(int x = 0; x<=2; x++){
                    System.out.print(board[i][x]+" ");
                  System.out.println(" ");
            }
            break;
        }     
        }
         for(int x = 0; x<=2; x++){
            
            for(int y = 0; y<= 2; y++){
              if(board[x][y]== '_'){
                tie = false;
              }

            }
        }
        if(tie == true)
        {
            System.out.println("it's a tie!");
            for(int i = 0; i<=2; i++){
                for(int x = 0; x<=2; x++){
System.out.print(board[i][x]+ " ");
                }
                System.out.println(" ");
                
            }

            break;
            
        }          
            
        }

    }

}

