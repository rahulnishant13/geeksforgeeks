/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphs_JAVA;

import java.util.ArrayList;

/**
 *
 * @author RAHUL
 */

class ImplementDFS
{
    private void dfs(ArrayList<ArrayList<Integer>> adjLists, boolean[] visited, int v)
    {
        visited[v] = true;
        System.out.print(v + " ");
        for(int w : adjLists.get(v))
        {
            if(!visited[w])
            {
                dfs(adjLists, visited, w);
            }
        }
    }
    
    public void driverDFS(ArrayList<ArrayList<Integer>> adjLists)
    {
        int n = adjLists.size();
        boolean[] visited = new boolean[n];
        for(int i=0; i < visited.length; i++)
        {
            if(!visited[i])
            {
                dfs(adjLists, visited, i);
            }
        }
    }
}

public class DFS
{
    public static void main(String [] arg )
    {
        //Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adjLists = new ArrayList<ArrayList<Integer>>();
        System.out.println("Number of Nodes : ");
        int n = 7;// sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            adjLists.add(new ArrayList<Integer>());
        }

        adjLists.get(0).add(1);
        adjLists.get(0).add(2);
        adjLists.get(0).add(3);

        adjLists.get(1).add(5);
        adjLists.get(1).add(6);

        adjLists.get(2).add(4);

        adjLists.get(3).add(2);
        adjLists.get(3).add(4);

        adjLists.get(4).add(1);

        adjLists.get(6).add(4);

        new ImplementDFS().driverDFS(adjLists);
    }
}