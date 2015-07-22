#include<stdio.h>
#include<conio.h>

int y=0;

void add (int a){
     int r=0;
    if(a > 0){
              r = a%10;
              y = y + r;
              a = a/10;
 add(a);
       }
      
            }

int main(){
    int a;
    scanf("%d",&a);
    add(a);
    printf("%d",y);
    getch();
   return 0; 
    }

