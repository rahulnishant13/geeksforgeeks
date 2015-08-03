/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */
class test
{
    int fibo(int i)
    {
        if (i == 0) System.out.print(" "+ i);
        if (i<= 2) System.out.print(" 1");

        int z = fibo(i - 1) + fibo(i - 2);
        System.out.print(" "+z);

        return 0;
    }

}

public class fibonacci
{
    public static void main(String[] args)
{
    int n = 0;

}
}
