/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class Combination
{
    private int [] arr;
    private int [] r;
    private int k;

    Combination(int k)
    {
        this.k = k;
        arr = new int[]{1, 2, 3, 4, 5};
        r = new int[this.k];
    }

    void setCombination()
    {
        getCombination(0,0);
    }
    void getCombination(int j, int index)
    {
        if(index == k)
        {
            for(int i=0; i<k;i++)
                System.out.print(r[i]);
            System.out.println();
            return;
        }

        if(j>=arr.length)
        {
            return;
        }
        
        r[index] = arr[j];
        getCombination(j+1 , index+1);

        getCombination(j+1, index);
        

    }
}

public class CombinationOfNumbers
{
    public static void main(String [] args)
    {
        Combination obj = new Combination(3);
        obj.setCombination();
    }
}
