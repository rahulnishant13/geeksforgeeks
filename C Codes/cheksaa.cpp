#include<stdio.h>
#include<stdlib.h>
typedef struct Node 
{
        int data;
        struct Node *next;
}node;
void insert(node *pointer, int data){
                                       while(pointer->next!=NULL)
                                               {
                                                               pointer = pointer -> next;
                                                                       }
                                       pointer->next = (node *)malloc(sizeof(node));
                                       pointer = pointer->next;
                                       pointer->data = data;
                                       pointer->next = NULL;
                                                     }

int evenodd( node *list, node **head)
{
     node *even = NULL, *odd = NULL, *temp;
     node *reven, *rodd;
    while (list != NULL)
    {
        temp = ( node *)malloc(sizeof( node));
        temp->data = list->data;
        temp->next = NULL;
        if (list->data % 2 == 0)
        {
            if (even == NULL)
            {
                even = temp;
            }
            else
            {
                reven->next = temp;
            }
            reven = temp;
        }
        else
        {
            if (odd == NULL)
            {
                odd = temp;
            }
            else
            {
                rodd->next = temp;
            }
            rodd = temp;
        }
        list = list->next;
    }
    reven->next = odd;
    *head = even;
}

int main()
{
        node *start,*temp;
        start = (node *)malloc(sizeof(node)); 
        temp = start;
        temp -> next = NULL;
        char a;
        int data;
        while(scanf("%d",&a)!= 's'){
                               scanf("%d",&data);
                               insert(start,data);
                               }
        
        evenodd(start,*temp);


}
