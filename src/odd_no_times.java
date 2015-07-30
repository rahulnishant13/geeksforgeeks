/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */
public class odd_no_times {
    public static void main(String a[]){
        Scanner num = new Scanner(System.in);
        int x,i,rslt=0;
        System.out.print("Enter no of data x :");
        x = num.nextInt();
        int[] arr = new int[x];

        for(i=0;i<x;i++){
            arr[i]=num.nextInt();
        }

        for(i=0;i<x;i++){
            rslt = rslt ^ arr[i];
        }

        System.out.print("Result : " +rslt);
    }

}
