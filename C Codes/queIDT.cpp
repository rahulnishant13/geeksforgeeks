#include<stdio.h>
#include<conio.h>
#include<malloc.h>

typedef struct node block;

struct node {
       int data;
       struct node* link;
       };

void insert(block * temp, int data){
     while(temp->link != NULL){
                      temp = temp->link;
                      }
     temp -> link = (block * )malloc(sizeof(block));
     temp = temp->link;
     temp->data = data;
     temp->link = NULL;
     }

block * r;

void delet(block * temp){
   
     
     if(temp->data==0){
     temp = temp->link;}
     r = temp;
     temp = temp->link;
     r->data = 0;
     }


void read(block * temp){
        while(temp->link != NULL ){
                   printf("%d\t",temp->data);
              temp=temp->link;     
                   }
              
              printf("%d\t",temp->data);               
             }

int main(){
    //block * r;
    int no=0,d,a;
    r = (block * )malloc(sizeof(block));
    r -> link = NULL;
     r -> data=0;
    printf("Insertion 1 \nDeletion 2 \nPrint 3");
    while(1)
    {
     scanf("%d",&no);
     
     if(no == 1)
      {
           scanf("%d",&d);
           insert(r,d);
      }
     else if(no == 2){
          delet(r);
          }
     
     else if(no == 3)
           read(r);
      
     else
          {printf("Nothing Entered");
           break;}
      }
     
      getch();
      return 0;
    }
