#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int d;
       struct node * r, * l;
       };

typedef struct node b;

b* insert(int data){
    b * t = (b *)malloc(sizeof(b));
    t->l = NULL;
    t->r = NULL;
    t->d = data;
    return (t);
    }

void reinsert(b * tem , int data){
     if(data > tem->d ){
           if(tem->r == NULL){
                     tem->r = (b *)malloc(sizeof(b));
                     tem = tem->r;
                     tem->d = data;
                     tem->r = NULL;
                     tem->l = NULL;
                     }
           else{
                tem = tem->r;
                reinsert(tem , data);
                }
           }
     else {
          if(tem->l == NULL){
                     tem->l = (b *)malloc(sizeof(b));
                     tem = tem->l;
                     tem->d = data;
                     tem->r = NULL;
                     tem->l = NULL;
                     }
           else{
                tem = tem->l;
                reinsert(tem,data);
                }
          }
     }

void pre(b *root){
     if(root != NULL){
             printf("%d, ",root->d);
             pre(root->l);
             pre(root->r);
             }     
     else  return;
     }

void in(b *root){
     if(root != NULL){
             in(root->l);
             printf("%d, ",root->d);
             in(root->r);
             }     
     else  return;
     }

void post(b *root){
     if(root != NULL){
             post(root->l);
             post(root->r);
             printf("%d, ",root->d);
             }
             
     else  return;
     }

int main(){
    int x,a,y;
    printf("");
    b * temp;
    
    while(true){
                printf("Insert 1\t Reinsert 2\t Post 3\t In 4\t Pre 5\n");
                scanf("%d",&a);
                
                if(a == 1){
                     scanf("%d",&x);
                     temp = insert(x);
                     }
                else if(a == 2){
                     scanf("%d",&y);
                     reinsert(temp,y);
                     }
                else if(a == 3){
                     post(temp);
                     }
                else if(a == 4){
                     in(temp);
                     }
                else if(a == 5){
                     pre(temp);
                     }
                else {
                     printf("Entered Nothing");
                     break;
                     }
                }
    getch();
    return 0;
    }
