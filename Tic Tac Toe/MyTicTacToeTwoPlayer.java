package MyGame;

import java.util.Scanner;

/**
 *
 * @author RAHUL
 */

class TicTacToe1
{
    private char[][] board;
    private char currentPlayer;

    public TicTacToe1() {
        board = new char[][]{{'-','-','-'},{'-','-','-'},{'-','-','-'}};
        currentPlayer = 'x';
    }

    void printBoard()
    {
        for(int i=0; i <3; i++){
            for(int j=0; j<3; j++)
            {
                System.out.print(board[i][j] +"   ");
            }
            System.out.println();
        }
    }

    boolean checkBoardFull()
    {
        boolean isFull = true;
        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == '-' ) {
                    isFull = false;
                }
        return isFull;
    }

     public void changePlayer() {
        if (currentPlayer == 'x') {
            currentPlayer = 'o';
        }
        else
            currentPlayer = 'x';
    }

     public boolean placeMark(int row, int col) {

        if ((row >= 0) && (row < 3))
            if ((col >= 0) && (col < 3))
                if (board[row][col] == '-') {
                    board[row][col] = currentPlayer;
                    return true;
                }
        return false;
    }

     public boolean ckeckForWin()
     {
         return (winRow() || winCol() || winDiagonals());
     }
    
    private boolean checkRowCol(char c1, char c2, char c3)
    {
        return ((c1 != '-') && (c1 == c2) && (c2 == c3));
    }
    private boolean winRow()
    {
        for(int i =0; i<3; i++)
        {
            if(checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
                return true;
        }
        return false;
    }
    private boolean winCol()
    {
        for(int i =0; i<3; i++)
        {
            if(checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
                return true;
        }
        return false;
    }
    private boolean winDiagonals() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }
}

public class MyTicTacToeTwoPlayer {
    public static void main(String [] args)
    {
        TicTacToe1 obj = new TicTacToe1();
        Scanner sc = new Scanner(System.in);
        obj.printBoard();
        while(true)
        {
            int x,y;
            
            System.out.println("Enter Row & Column : ");
            x = sc.nextInt();
            y = sc.nextInt();
            obj.placeMark(x, y);
            obj.printBoard();
            if(obj.ckeckForWin())
            {
                System.out.println("We have a winner");
                System.exit(0);
            }
            else if(obj.checkBoardFull())
            {
                System.out.println("Draw");
                System.exit(0);
            }

            obj.changePlayer();
            System.out.println("\n\n\n\n");
        }
    }
}
