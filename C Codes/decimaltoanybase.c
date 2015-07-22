#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b=8,m,n=0,y=1;
    printf("Enter number in decimal: ");
    scanf("%d",&a);
           while(a != 0)
            {
                 m = a % b;
                a = a / b;
                 
                n = m*y + n;
                y = y*10;        
              }
    printf("%d",n);
    getch();
    return 0;   
}
