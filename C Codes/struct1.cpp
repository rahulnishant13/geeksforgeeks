#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int data;
       struct node* link;
       };
   typedef struct node ode;    
struct node* top;
ode * base;
void insert(int dat)
{
         //int data;
         if(top == NULL)
         { 
           top =(struct node* ) malloc(sizeof (struct node));
           top->data = dat;
           base=top;
                }
         else
         {       
         struct node* newd;
         newd = (struct node* )malloc(sizeof (ode));
      //   newd.data = dat;
         top->link = newd;
         top = newd;
          
          }
           }

          
          
int main()
   {
          //struct node *base;
      int o,r=1;
      printf("For deletion inter 1, insertion 2, traversal 3"); 
      printf("Enter your choice");
      scanf("%d",&o);   
      while(r==1){
      
      if(o == 2)
      {
           int data;
           printf("Enter data");
           scanf("%d",&data);
           insert(data);
           }
        printf("do u want to continue enter 1 ");
        scanf("%d",&r);   
           } 
           
    while(base->link==NULL){
                  printf("/n%d",base->data);          
                    base=base->link;        }       
            getch();
      return 0;  
           }
