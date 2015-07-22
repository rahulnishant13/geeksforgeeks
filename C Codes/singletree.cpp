#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int d;
       struct node * l ,* r;
       };

typedef struct node box;

void insert(box ** h,box *br ){
     if(!(*h)){
               *h = br;
               }
     if((*h)->d < br->d)
         insert(&(*h)->r,br);
     if((*h)->d > br->d)
         insert(&(*h)->l,br);
     }

void printout(box * h) {
   if((h) != NULL){
              printout(h -> l);
              printf("%d\t",h -> d);
              printout(h -> r);
              }}

int main(){
    box * h=NULL, * br;
    int a,n;
    printf("No of elements : ");
    scanf("%d",&a);
    for(int i=0;i<=a;i++){
            br = (box *)malloc(sizeof(box));
            br->l = br->r = NULL;
            scanf("%d",&n);
            br->d = n;
            insert(&h,br);
            }
    
    printout(h);
    
    getch();
    return 0;
    }
