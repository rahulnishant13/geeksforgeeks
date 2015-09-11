/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs_JAVA;

import java.util.Stack;

/**
 *
 * @author RAHUL
 */

public class DFSMatrixRec
{
    Stack<Integer> st;
    int vFirst;
    int[][] adjMatrix;
    int[] isVisited = new int[7];

     DFSMatrixRec(int[][] Matrix)
     {
         this.adjMatrix = Matrix;
         st = new Stack<Integer>();
         int i;
         int[] node = {1, 2, 3, 4, 5, 6, 7};
         int firstNode = node[0];
         for (i = 1; i < node.length-1; i++)
         {
             depthFirst(firstNode, node[i]);
         }
    }

    public void depthFirst(int vFirst,int n)
    {
        int v,i;
        st.push(vFirst);

        while(!st.isEmpty())
        {
            v = st.pop();
            if(isVisited[v]==0)
            {
                System.out.print("\n"+v);
                isVisited[v]=1;
            }
            for ( i=1;i<=n;i++)
            {
                if((adjMatrix[v][i] == 1) && (isVisited[i] == 0))
                {
                    st.push(v);
                    isVisited[i]=1;
                    System.out.print(" " + i);
                    v = i;
                 }
            }
         }
    }

    public static void main(String[] args)
    {
        int[][] adjMatrix = { {0, 1, 1, 0, 0, 0, 0},
                              {1, 0, 0, 1, 1, 1, 0},
                              {1, 0, 0, 0, 0, 0, 1},
                              {0, 1, 0, 0, 0, 0, 1},
                              {0, 1, 0, 0, 0, 0, 1},
                              {0, 1, 0, 0, 0, 0 ,0},
                              {0, 0, 1, 1, 1, 0, 0}  };
        new DFSMatrixRec(adjMatrix);
     }
}