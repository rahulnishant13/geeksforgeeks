#include<stdio.h>
#include<conio.h>

int add (int y){
     static int z = 0;
    if(y > 0){
              z = z + y%10;
              y = y/10;
       add(y);
       }
       return z;
     }

int main(){
    int x ,y;
    scanf("%d",&x);
    y=add(x);
    printf("%d",y);
    getch();
   return 0; 
    }

