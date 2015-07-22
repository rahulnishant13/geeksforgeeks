#include<stdio.h>
#include<conio.h>

int main()
{
  int i,a[5]={5,1,7,8,4},j,n=5,temp;
  
  for(i=0;i<n;)
  {
   for(j=i;j<n;j++)
   {
     if(a[i]>a[j])
     {
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
     }
   else
   {}
   }
  i++;
  }

printf("\nS Short %d %d %d %d %d ",a[0],a[1],a[2],a[3],a[4],a[5]);
getch();
return 0;
}
