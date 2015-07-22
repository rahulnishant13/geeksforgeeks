#include<stdio.h>
#include<conio.h>

void rev();

int main(){
    rev();
    getch();
   return 0; 
    }

void rev(){
    auto char c;
     scanf("%c",&c);
     if(c=='t'){ 
           printf("%c",c);
           return;     
                }
      rev();  
      printf("%c",c);        
     }
