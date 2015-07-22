#include<stdio.h>
#include<conio.h>


int main()
{
  int j,k=0,n=4,i=0,a[4]={4,8,3,9},temp;
  while(k<n)
  {
    for(j=0;j<n;j++)
     {
      if(a[j]<a[j+1]){
        
        }
      else{
       temp = a[j];
       a[j] = a[j+1];
       a[j+1] = temp;
           }
     }
    k++;
   }
   
  printf("B Shorted Result");
  printf("\n %d \t %d \t %d \t %d",a[1],a[2],a[3],a[4]);
  getch();
  return 0;
}
