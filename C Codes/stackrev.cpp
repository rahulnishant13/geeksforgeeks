#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
     char data;
     struct node * next;
     };
typedef struct node * nod;

int main(){
    nod  block, last = NULL;
    char c;

    do{
         scanf("%c",&c);
         block = (nod)malloc(sizeof(node));
         block->data = c;
         block->next = last;
         last = block;
         }
    while(c!='t');

    while(last!= NULL){
                 printf("%c",last->data);
                 last=last->next;
                 }
    getch();
    return 0;
    }
