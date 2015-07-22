#include<stdio.h>
#include<conio.h>
#include<string.h>

void fun(char *a){
     char *ch;
     while(*a != 0){
              *ch = *a;
              fun(ch--);
              printf("%c",ch);
              }
     }


int main(){
    char a[20];
    
    gets(a);
    fun(a);
    getch();
    return 0;
    }

