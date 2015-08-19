/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class ProductArray
{
    private int [] arr;
    private int [] prd;

    public ProductArray()
    {
        arr =new int[]{10,3,5,6,2};
        prd =new int[arr.length];
    }

    void creatProductArray()
    {
        int temp=arr[arr.length-1];
        for(int j = arr.length-1; j > 0 ; j--)
        {
            prd[j] = temp;
            temp *= arr[j-1];
        }
        getProduct();
    }
    void getProduct()
    {
        int temp = 1 ;
        for (int i = 1; i < arr.length; i++) {
            System.out.println(" "+(prd[i]*temp));
            temp *= arr[i-1];
        }
        System.out.println(" "+temp);
    }

}

public class ProductArrayPuzzle
{
    public static void main(String [] args)
    {
        ProductArray obj = new ProductArray();
        obj.creatProductArray();
    }
}
