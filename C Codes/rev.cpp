#include<stdio.h>
#include<conio.h>

void rev();

int main(){
    rev();
    getch();
   return 0; 
    }

void rev(){
    char c;
     scanf("%c",&c);
     if(c=='\n'){ 
           printf("%c",c);
           return;     
                }
      rev();  
      printf("%c",c);        
     }
