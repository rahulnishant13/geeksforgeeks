#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int d;
       struct node * l, *r;
       };

typedef struct node box;

void insert(box ** head , box * next){
           if(!(*head)){
                        *head = next;
                        }
           if((*head)->d > next->d)
              insert(&(*head)->l,next);

           if((*head)->d < next->d)
              insert(&(*head)->r,next);
           
           }

void printout(box * tree) {
   if((tree) != NULL){
              printout(tree -> l);
              printf("%d",tree -> d);
              printout(tree -> r);
              }}


int main(){
    box * head = NULL, * next;
    int i, a;
    for(i=0;i<5;i++){
                     next = (box *)malloc(sizeof(box));
                     next -> l = next -> r = NULL;
                     scanf("%d",&a);
                     next -> d = a;
                     insert(&head,next);
                     }
    printout(head);
    getch();
    return 0;
    }
