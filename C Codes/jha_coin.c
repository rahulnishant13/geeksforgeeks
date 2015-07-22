#include<stdio.h>
#include<conio.h>
int f(int a)
{int x,y,z;
if(a<12)
return a;
else
{
    x=(a>=f(a/2))?(a/2):(f(a/2));
        printf("%d  XX  ",x);
    y=(a>=f(a/3))?(a/3):(f(a/3));
        printf("%d  YY  ",y);
    z=(a>=f(a/4))?(a/4):(f(a/4));
        printf("%d  ZZ  ",z);
    return(x+y+z);
}

     };

int main(){
    int x,y;
    scanf("%d",&x);
    
    y=f(x);
    printf("%d",y);
    getch();
    }
