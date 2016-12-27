/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */
public class PatternMindtree {
    public static void main(String [] args)
    {
        int no_row = 4;
        int i = 1, n =20;
        while(i < n)
        {
                while((i%no_row != 0) && (i < n))
                {
                    System.out.print(i+ " ");
                    i++;
                }

                if(i%no_row == 0)
                {
                    System.out.println(i);
                    i += no_row+1;
                }   
        }

        i = i - (no_row+1);

        while(i > 0)
        {
            while((i%no_row != 0) && (i < n))
            {
                System.out.print(i+ " ");
                i--;
            }

            if(i%no_row == 0)
            {
                System.out.println(i);
                i += no_row+1;
            }
        }

    }
}
