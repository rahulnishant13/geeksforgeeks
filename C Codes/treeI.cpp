#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node {
       int data;
       struct node* right;
       struct node* left;
       };

typedef struct node block;

void insert(block ** temp, int data){
      if(*temp == NULL){
                      *temp = (block * )malloc(sizeof(block));
                      (*temp)->data = data;
                      (*temp)->right = NULL;
                      (*temp)->left = NULL;
                      }
    else{
     if(data > (*temp)->data){
            // temp->right;
          insert(&((*temp)->right),data);
           }

     else 
          { //printf("%djhgjjaaaaa\n",temp->left);
          insert(&((*temp)->left),data);
           }
           }
}

void pre(block **temp){
     printf("%d \n",(**temp).data);
     pre(&((**temp).right));
       pre(&((**temp).left));
     }



int main()
{
        block * t;
        int d,a;
        t = (block *)malloc(sizeof(block));
        t -> left = NULL;
        t -> right = NULL;
        t -> data = 55;
        
        while(true){
                    printf("Insertion 1 \nPrint 2\n");
                   scanf("%d",&a);
                 if(a == 1){
                          scanf("%d",&d);
                          insert(&t,d);
                          }

                 else{
                      printf("Nothing Entered");
                      pre(&t);
                      break;
                      }
                 }
                 getch();
}
