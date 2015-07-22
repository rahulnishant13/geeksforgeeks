#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node {
       int data;
       struct node* right;
       struct node* left;
       };

typedef struct node block;

void insert(block * temp,int data){
             if(data > temp->data){
                                  if(temp->right == NULL){
                                       temp->right = (block *)malloc(sizeof(block));
                                       temp = temp->right;
                                       temp->data = data;
                                       temp->right = NULL;
                                       temp->left = NULL;
                                        }
                                  else {
                                       temp = temp->right;
                                       //temp->data = data;
                                       insert(temp,data);
                                       }
                     }
             else {
                  if(temp->left == NULL){
                                temp->left = (block *)malloc(sizeof(block));
                                temp = temp->left;
                                temp->data = data;
                                temp->right = NULL;
                                temp->left = NULL;
                                }
                  else {
                       temp = temp->left;
                      // temp->data = data;
                       insert(temp,data);
                       }
                  }
             }

void pre(block *root){
     if(root != NULL){
     printf("%d ,",root->data);
     pre(root->left);
     pre(root->right);
     }
    else return;
     }

void pos(block *root){
     if(root != NULL){
             pos(root->left);
             printf("%d, ",root->data);
             pos(root->right);
             }
     else return;
     }

void in(block *root){
     if(root != NULL){
             in(root->left);
             in(root->right);
             printf("%d, ",root->data);
             }
     else return;
     }



int main(){
    block * t;
    int d,a;
    t = (block *)malloc(sizeof(block));
    t->left = NULL;
    t->right = NULL;
    t->data = 55;
    
   printf("");
    
    while(true){ printf("Insertion 1. \nPrint 2.");
                scanf("%d",&a);
                if(a==1){
                         scanf("%d",&d);
                         insert(t,d);
                         }
                else if(a==2){
                          pre(t);
                          }
                else if(a==3){
                          pos(t);
                          }
                else if(a==4){
                     
                         in(t);
                         }
                
                else    {
                         printf("Enterd Nothing");
                         break;
                         }
                
                }
    getch();
    return 0;
    }
