#include<stdio.h>
#include<conio.h>
#define PRODUCT(x)(x*x)
int main(){
    int i=3,j,k,l;
    j = PRODUCT(i+1);
    printf("%d  %d",i,j);
    k = PRODUCT(i++);
    printf("\n%d  %d",i,k);
    l = PRODUCT(++i);
    printf("\n%d  %d  %d  %d\n",i,j,k,l);
    getch();
    return 0;
    }
