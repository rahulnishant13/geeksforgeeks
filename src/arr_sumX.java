/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
import java.util.Arrays;
public class arr_sumX {
    public static void main(String z[]){

        int[] arr={-8, 1, 12, 5, 10, 45};
        Arrays.sort(arr);

        int i=0,l=5,x=0,d=16;
        
        while(i>=l)
        {
            if((arr[i]+arr[l]) > 16)
                l--;
            if((arr[i]+arr[l]) < 16)
                i++;
            if((arr[i]+arr[l]) == 16)
            {
                System.out.println("FOUND");
                return;
            }

        }
        System.out.print(" " +arr[i] + " " +arr[l]);
        return;
    }

}
