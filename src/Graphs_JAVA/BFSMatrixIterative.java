/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs_JAVA;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author RAHUL
 */

class BFSMatrixQueue
{
    private Queue<Integer> qu;

    public BFSMatrixQueue()
    {
        qu = new LinkedList<Integer>();
    }

    void bfs(int adjacency_matrix[][], int source)
    {
        int no_of_nodes = adjacency_matrix[source].length -1;
        int [] visited = new int[no_of_nodes + 1];
        int i, element;

        visited[source] = 1;
        qu.add(source);

        while(!qu.isEmpty())
        {
            element = qu.remove();
            i = element;
            System.out.print(i+"\t");

            while(i <= no_of_nodes)
            {
                if(adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {
                    qu.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }

}

public class BFSMatrixIterative
{
    public static void main(String [] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of nodes in the graph");
            int no_of_nodes = sc.nextInt();

            int [][] adjacency_matrix = new int[no_of_nodes +1][no_of_nodes +1];

            System.out.println("Enter the adjacency matrix");
            for(int i=1; i<=no_of_nodes; i++)
                for(int j=1; j<=no_of_nodes; j++)
                    adjacency_matrix[i][j] = sc.nextInt();

            System.out.println("Enter the source nodes");
            int source = sc.nextInt();

            System.out.println("The BFS traversal of the graph is");
            BFSMatrixQueue b = new BFSMatrixQueue();
            b.bfs(adjacency_matrix,source);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong Input format");
        }
    }
}