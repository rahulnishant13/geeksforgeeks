/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class merge_mn {
    public static void main(String x[]){
    int a[]={5,9,12,20,0,0,0};
    int [] b={3,7,18};
    int i,j=3,k=2;

    for(i=6;i>0;i--){
        if(a[j]>b[k]){
        a[i] = a[j];
        j--;
        }
        else {
            a[i]=b[k];          
            k--;
         }
        }
   while(i>=0){
   if(k>=0){
       a[i]=b[k];
       k--;}
   else{
       a[i]=a[j];
       j--;
   }
   i--;}

for(i=0;i<7;i++)
    System.out.print(" " +a[i]);
    }
}