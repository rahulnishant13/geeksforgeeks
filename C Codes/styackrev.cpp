#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct node{
       char data;
       node *next;
       };
typedef struct node * nod;       
       
int main(){
    nod  last=NULL;
     char c;
    do{scanf("%c",&c);
         nod block=(nod )malloc(sizeof(node));
         block->data=c;
          block->next=last;
         last=block; 
           }
    while(c!='t');   
   
    while(last!=NULL){
                            printf("%c",last->data);
                            last=last->next;
                            }    
    
    getch();
    return 0;
    }
