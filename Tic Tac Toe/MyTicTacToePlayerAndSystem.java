/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MyGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RAHUL
 */



class Board
{
    public char[] board = new char[]{ '-','-','-','-','-','-','-','-','-'};
    private int[][] wins  = new int[][]{{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    ArrayList list = new ArrayList();
    int index;

    public Board() {
    }

    void display()
    {
        for (int i = 1; i <= board.length; i++) {
            System.out.print( board[i-1] +"  ");
            if(i%3 == 0) System.out.println("\n--------");
        }
    }

    void placeAMove(int p, int i) {
        if(i == 1) board[p] = 'X';
        else board[p] = 'O';
    }

    public boolean isGameOver() {
        return (hasXWon() || hasOWon() || getAvailableStates());
    }

    public boolean hasXWon(){
        for(int i = 0; i < 8; ++i)
        {
            if(board[wins[i][0]] ==  'X' && board[wins[i][0]] == board[wins[i][1]] && board[wins[i][0]] == board[wins[i][2]])
                return true;
        }
        return false;
    }

    public boolean hasOWon(){
        for(int i = 0; i < 8; ++i)
        {
            if(board[wins[i][0]] ==  'O' && board[wins[i][0]] == board[wins[i][1]] && board[wins[i][0]] == board[wins[i][2]])
                return true;
        }
        return false;
    }

    public boolean getAvailableStates() {
        for (int i = 0; i < 9; i++)
        {
            if(board[i] == '-')
               return false;
        }
        return true;
    }

    public int minimax(int x, int turn) {
        if (hasXWon()) return 1;

        if (hasOWon()) return -1;

        if (getAvailableStates()) return 0;

        int maxVal = 0 , minVal  = 0;
        if(turn == 1)
        {
            maxVal = Integer.MIN_VALUE;
                for (int i = 0; i < 9; ++i)
                {
                    if(board[i] == '-')
                    {
                            int localSelectX = i;
                            int val;
                            placeAMove(localSelectX, 1);

                            val = minimax(x + 1, 2);

                            board[localSelectX] = '-';
                          if(val > maxVal)
                          {
                              if (x == 0)
                              this.index = i;
                                maxVal = val;
                          }
//                             if (x == 0)
//                             System.out.println(i + "  " +this.index+ "  " +maxVal  );
                      }
                 }
            return maxVal;
            }
        if(turn == 2){
            minVal = Integer.MAX_VALUE;
        for (int i = 0; i < 9; ++i) {
            if(board[i] == '-'){
                int localSelectO = i;
                    int val;
                    placeAMove(localSelectO, 2);
                    val = minimax(x + 1, 1);
                    board[localSelectO] = '-';
                    minVal = (val < minVal) ? val : minVal;
                }
            }
            return minVal;
        }
        return 0;
    }
}

public class MyTicTacToePlayerAndSystem {
    public static void main(String [] args)
    {
        Board b = new Board();
        b.display();
        Random rand = new Random();

        System.out.println("(1)Computer (2)User: ");
        int choice = new Scanner(System.in).nextInt();
        if(choice == 1){
            b.placeAMove(rand.nextInt(10), 1);
            b.display();
        }

        while (!b.isGameOver()) {
            System.out.println("\nYour move:[0...8] ");
            int x = new Scanner(System.in).nextInt();
            while(b.board[x-1] != '-' )
            {
                System.out.println("Invalid Move");
                x = new Scanner(System.in).nextInt();
            }
            b.placeAMove(x-1 , 2);
            //b.display();
            System.out.println("\n");
            if (b.isGameOver()) {
                break;
            }
            b.minimax(0, 1);
            b.placeAMove(b.index, 1);
            b.display();
        }
        if (b.hasXWon()) {
            System.out.println("Unfortunately, you lost!");
        } else if (b.hasOWon()) {
            System.out.println("You win! This is not going to get printed.");
        } else {
            System.out.println("It's a draw!");
        }
        }
    }
