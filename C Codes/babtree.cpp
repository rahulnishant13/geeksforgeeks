#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int data;
       struct node * left, * right;
       
       };
typedef struct node box;


void insert(box **top,box * temp ){
     if(!(*top)){
                    *top=temp;
                    }
     
          if(((*top)->data)>(temp->data)){
                                        insert(&((*top)->left),temp);
                                        }
           else if(((*top)->data)<(temp->data)) {
                                          insert(&((*top)->right),temp);     
                                         
          
          }               
     
     }     


void inorder(box * top){
     if(top!=NULL){
           inorder(top->left);
           printf("%d\t",top->data);
           inorder(top->right);        
                   }
     
     }
     

int main(){
    
    box * ne,* top =NULL;
    int i=0;
    while(i<10){
    ne=(box *)malloc(sizeof(box));
    ne->left=ne->right=NULL;
    ne->data=rand()%10;
    insert(&top,ne);
    i++;
}
    inorder(top);
    getch();
    return 0;
    }
