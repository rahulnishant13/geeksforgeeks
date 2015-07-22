#include<stdio.h>
#include<conio.h>
#include<malloc.h>


struct node{
       int data;
       struct node * l;
       struct node * r;
       };

typedef struct node block;

void insert(block * temp, int data){
        
        while(temp -> r != NULL)
        temp = temp ->r;
	
        temp -> r = (block *)malloc(sizeof(block));
        (*temp).r -> l = temp;  /* MUST WATCH THIS */
        temp = (*temp).r;  /* MUST WATCH THIS */
        temp -> data = data;
        temp -> r = NULL;
        }

void read(block *temp){
     while(temp -> r != NULL){
     printf("%d \n",temp->data);
     temp = temp->r;
             }
     printf("%d \n",temp->data);
             }

void del(block * t, int n)
{	
    struct node * x;
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
	if(t -> r == NULL){
         t = t -> l;
         t -> r = NULL;
         }
   else{
        printf("NO. NOT FOUND");
        }
}



int main(){
    block * temp;
    temp = (block *)malloc(sizeof(block));
    temp -> data = 22;
    temp -> l = NULL;
    temp -> r = NULL;
    int a,d,c;
    while(true){
   printf("FOR Insert 1. Print 2. Del 3.");
   scanf("%d",&a);
   if(a == 1){
        printf("enter data");
        scanf("%d",&d);
        insert(temp,d);
        }
   else if(a == 2) {
        read(temp);
        }
   else if( a == 3){
        printf("No. to be deleted");
        scanf("%d",&c);
        del(temp,c);
        }
   else
     break;
    }
    getch();
    return 0;
    }
