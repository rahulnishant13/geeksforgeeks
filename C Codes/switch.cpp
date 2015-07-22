#include<stdio.h>
#include<conio.h>

int main(){
    int a;
    scanf("%d",&a);

    switch(a){
              case 1 : {
                   printf("1111111");
                   break;
                   }
              case 2 : {
                   printf("2222222");
                   break;
                   }
              case 3 : {
                   printf("333333");
                   break;
                   }
              default : {
                      printf("Nothing Entered");
                      break;
                      }
              }
    getch();
    return 0;

    }
