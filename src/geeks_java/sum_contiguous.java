/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */
public class sum_contiguous {
    public static void main(String z[]){
        Scanner num = new Scanner(System.in);
        int x,i,max=0,rslt=0;
        x = num.nextInt();
        int[] arr= new int[x];

        for(i=0;i<x;i++){
            arr[i] = num.nextInt();
        }

    for(i=0;i<x;i++){
        max = max + arr[i];
        if(max<0)
            max =0;
        if(rslt<max)
            rslt = max;
    }

    System.out.print("result : " +rslt);
    }
}