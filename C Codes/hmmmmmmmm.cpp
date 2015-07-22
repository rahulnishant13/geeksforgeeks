#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int data;
       struct node * left, * right;
       };
typedef struct node box;

void insert(box ** head, box * next){
     if(!(*head)){
                  *head = next;
                  }
     if((*head)->data < next->data)
          insert(&(*head)->right,next);
     
     if((*head)->data > next->data)
          insert(&(*head)->left,next);
     }

void inorder(box * head){
     if(head != NULL){
              inorder(head -> left);
              printf("%d\t",head -> data);
              inorder
              (head -> right);
              }
     }


int main(){
    box * head = NULL, * next;
    int i=1,a,b;
    printf("Enter no of Elements : ");
    scanf("%d",&b);
    while(i<=b){
               next = (box *)malloc(sizeof(box));
               next->right = next->left = NULL;
               scanf("%d",&a);
               next->data = a;
               insert(&head,next);
               i++;
               }    
    inorder(head);
    getch();
    return 0;
    }
