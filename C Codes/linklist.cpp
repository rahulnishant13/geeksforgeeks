#include<stdio.h>
#include<conio.h>
#include<malloc.h>


 struct node {
       int data;
       struct node* link; 
       };
       
typedef struct node block;

void insert(block * temp, int data){
     
     // int i=0;
        while(temp->link != NULL){
                   //printf("%d\t",temp->data);
              temp=temp->link;
                
                   } 
      temp->link=(block *)malloc(sizeof(block));
      temp=temp->link;
      temp->data=data;
      temp->link=NULL;
     // printf("\ndddddd%d\t",temp->data);
     // temp->link=NULL;                 
             }
void read(block * temp){
        while(temp->link != NULL){
                   printf("%d\t",temp->data);
              temp=temp->link;     
                   } 
                   printf("%d\t",temp->data);               
             }             

int main(){
   block * n1;
 n1=  (block *)malloc(sizeof(block));
   n1->link = NULL;
   insert(n1,22);
    insert(n1,26);
     insert(n1,22);
    read(n1);
    getch();
    return 0;
    }
