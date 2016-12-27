package Array_JAVA;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */

class Hcf{
    int gcd(int a,int b)
    {
       if(b==0)
         return a;
       else
         return gcd(b, a%b);
    }
}

public class ArrayRotation {
    public static void main(String z[]){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int w,windowsize=3,temp,i,j,k,n=11;
        Hcf ob= new Hcf();
        w=ob.gcd(arr.length,windowsize);

        for(i= 0; i<w; i++){
            temp = arr[i];
            j = i;
            while(true)
            {
              k = j + w;
              if (k >= n)
                k = k - n;
              if (k == i)
                break;
              arr[j] = arr[k];
              j = k;
            }
            arr[j] = temp;
          }

                System.out.println(0x10 + 10 + 010);

            for(i = 0; i < 12; i++){
                System.out.print(" " +arr[i]);
            }
    }
}
