#include<stdio.h>
#include<conio.h>
#include<malloc.h>


struct node {
       int data;
       struct node *l, *r;
       };

typedef struct node block;

void insert(block * temp, int data){
   
	
        x = temp;
        temp -> r = (block *)malloc(sizeof(block));
        printf("%d temp \n", temp);
        temp = temp -> r;
        temp-> l = x;
        printf("%d l \n",temp -> l);
        printf("%d r \n",temp -> r);
        temp -> data = data;
        temp -> r = NULL;
        }

void del(block * t, int n)
{
	struct node * x;
	if(t -> data == n){
         printf("LL1 %d\t RR2 %d\n",t -> l, t -> r);
         t = t -> r;
         t -> l = NULL;
	     printf("LL2 %d\t RR2 %d",t -> l, t -> r);
         }
 	
	while(t -> r != NULL)
	{
		if(t -> data == n)
		{
            x = t;
			t -> l -> r = x -> r;
			x -> r -> l = x -> l;
			x = NULL;
		}
		t = t -> r;
	}
/*	if(t -> data == n)    /*last element deleted
	{ 	x = t -> next;
		free(x);
		q->next=NULL;
		break;
	}*/
	printf("Element %d not found\n",n);
}

void read(block *temp){
     while(temp -> r != NULL){
     printf("%d \n",temp->data);
     temp = temp->r;
             }
     printf("%d \n",temp->data);
             }         

int main(){
   block * t;
        int d,a,c;
        t = NULL;
   while(true){
   printf("FOR Insert 1. Print 2. Del 3.");
   scanf("%d",&a);
   if(a == 1){
        printf("enter data");
        scanf("%d",&d);
        insert(t,d);
        }
   else if(a == 2) {
        read(t);
        }
   else if( a == 3){
        printf("No to be deleted");
        scanf("%d",&c);
        del(t,c);
        }
   else
     break;
    }
    getch();
    return 0;
    }
