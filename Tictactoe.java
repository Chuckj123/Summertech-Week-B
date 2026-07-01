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
            if (board[row][column] == 'X' || board[row][column] == 'O') {
                System.out.println("choose a different place");
            } else {
                board[row][column] = turn;
                if (turn == 'X') {
                    turn = 'O';
                } else {
                    turn = 'X';
                }
            }

        }

    }

}