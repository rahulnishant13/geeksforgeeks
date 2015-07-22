#include<stdio.h>
#include<conio.h>

int main(){
    int b=5;
    int * a = &b;
    printf("%d \t %d ", **(&a), b);
    
    getch();
    return 0;
    }
