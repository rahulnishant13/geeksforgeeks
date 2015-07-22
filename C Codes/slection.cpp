#include<stdio.h>
#include<conio.h>

int main(){
    int a[6]={3,1,33,25,54,-6},i,j,n = 6,temp;
      
  for(i=0; i<n ;i++)
  {
   for(j=i+1;j<n;j++)
   {
     if(a[i]>a[j]){
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
     }
   }
  }
int k = 0;
while(k<6){
           printf("%d\t",a[k]);
           k++;
           }
getch();
return 0;
}
