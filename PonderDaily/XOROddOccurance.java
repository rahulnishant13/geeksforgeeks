/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PonderDaily;

/**
 *
 * @author RAHUL
 */

class XorBitSet
{
    int [] arr;
    XorBitSet()
    {
        arr = new int[]{1,2,3,2,1,3,3,4};
    }

    void findOddOccurance()
    {
        int i, xor =0, setbit, x=0, y=0;
        for(i =0; i < arr.length; i++)
            xor = xor^arr[i];

        setbit = xor & ~(xor -1);

        for(i=0; i<arr.length; i++)
        {
            if((arr[i] & setbit) == 0)
                x = x^arr[i];
            else
                y = y^arr[i];
        }
        System.out.println(x+" "+y);
    }
}

public class XOROddOccurance
{
    public static void main(String [] args)
    {
        XorBitSet obj = new XorBitSet();
        obj.findOddOccurance();
    }
}
