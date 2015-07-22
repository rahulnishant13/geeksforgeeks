#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int data;
       struct node* r;
       struct node* l;       
       };

typedef struct node block;

void insert(block * temp, int data){
     if(data < temp->data ){
             while(temp -> l != NULL)
             temp = temp-> l;
             
                  temp -> l = (block *)malloc(sizeof(block));
                  temp = temp -> l;
                  temp -> data = data;
                  temp -> r = NULL;
                  temp -> l =NULL;
                  
                  }
     else {
             while(temp -> r != NULL)
             temp = temp-> r;
     
                  temp -> r = (block *)malloc(sizeof(block));
                  temp = temp -> r;
                  temp -> data = data;
                  temp -> r = NULL;
                  temp -> l =NULL;
             }
             
     }

void pos(block *temp){
     if(temp != NULL){
     pos(temp->l);
     pos(temp->r);
     printf("%d \n",temp->data);
     }
     }

void pre(block *temp){
     if(temp != NULL){
     printf("%d \n",temp->data);
     pre(temp->l);
     pre(temp->r);
     }
     }

void inor(block *temp){
     if(temp != NULL){
     inor(temp->l);
     printf("%d \n",temp->data);
     inor(temp->r);
     }
     }


int main(){
    block * temp;
    temp = (block * )malloc(sizeof(block));
    temp -> data = 85;
    temp -> r = NULL;
    temp -> l = NULL;
    
    int a,d;
    printf("Insert 1. Pre 2. Pos 3. Inor 4.");
    
    while(true){
                scanf("%d",&a);
                if( a == 1){
                    printf("\nInsert Data");
                    scanf("%d",&d);
                    insert(temp , d);
                    }
                else if( a == 2){
                     pre(temp);
                     }
               else if( a == 3){
                     pos(temp);
                     }
               else if( a == 4){
                     inor(temp);
                     }
                else {
                     printf("\nEntered Nothing");
                     break;
                     }
    }
    getch();
    return 0;    
    }
