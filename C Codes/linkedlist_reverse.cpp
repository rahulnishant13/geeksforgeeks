#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* link;
};
typedef struct node block;

void reverse(struct node **head)
{
    struct node *p, *q, *r;
 
    p = q = r = *head;
    p = p->link->link;
    q = q->link;
    r->link = NULL;
    q->link = r;
 
    while (p != NULL)
    {
        r = q;
        q = p;
        p = p->link;
        q->link = r;
    }
    *head = q;
}

void insert(block * temp, int data){
        while(temp->link != NULL){
              temp=temp->link;
                
                   } 
      temp->link=(block *)malloc(sizeof(block));
      temp=temp->link;
      temp->data=data;
      temp->link=NULL;           
             }
 
void read(block * p){
        while (p != NULL)
    {
        printf("%d\t", p->data);
        p = p->link;
    }
             }

int main()
{
   
     block * n1;
 n1=  (block *)malloc(sizeof(block));
   n1->link = NULL;
   insert(n1,22);
    insert(n1,26);
     insert(n1,27);
    read(n1);
     reverse(&n1);                      
     printf("\n Reversed Linked list \n");
     read(n1);
    getchar();
    return 0;

}
