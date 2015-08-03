/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

class Median
{
    ArrayList<Integer> num = new ArrayList();
    Median()
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(x != 0)
        {
            num.add(x);
            getMedian();
            x = sc.nextInt();
        }        
    }

    void getMedian()
    {
        int x;
        if((num.size()%2) == 0 )
        {
            x = ( num.get(num.size()/2) + num.get((num.size()/2) - 1))/2;
            System.out.println("Median is : " +x);
        }
        else
        {
            System.out.println("Median is : " +num.get(num.size()/2));
        }
    }
}

public class MedianAtAnyPoint
{
    public static void main(String [] args)
    {
        Median obj = new Median();
    }

}
