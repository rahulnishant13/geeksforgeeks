#include <stdio.h>
#include<conio.h>
#include <stdlib.h>
 
struct node
{
    int num;
    struct node *next;
};
 
void create(struct node **);
void sorteo(struct node *, struct node**);
void display(struct node *);
 
int main()
{
    struct node *p = NULL, *q = NULL;
 
    printf("Enter data\n");
    create(&p);
    printf("Displaying the nodes :\n");
    display(p);
    sorteo(p, &q);
    printf("list with even and then odd:\n");
    display(q);
    getch();
    return 0;
}
 
void sorteo(struct node *list, struct node **head)
{
    struct node *even = NULL, *odd = NULL, *temp;
    struct node *reven, *rodd;
    while (list != NULL)
    {
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = list->num;
        temp->next = NULL;
        if (list->num % 2 == 0)
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
 
void create(struct node **head)
{
    int c, ch;
    struct node *temp, *rn;
 
    do
    {
        printf("Enter number: ");
        scanf("%d", &c);
        temp = (struct node *)malloc(sizeof(struct node));
        temp->num = c;
        temp->next = NULL;
        if (*head == NULL)
        {
            *head = temp;
        }
        else
        {
            rn->next = temp;
        }
        rn = temp;
        printf("to continue [1/0]: ");
        scanf("%d", &ch);
    } while (ch != 0);
    printf("\n");
}
 
void display(struct node *p)
{
    while (p != NULL)
    {
        printf("%d\t", p->num);
        p = p->next;
    }
    printf("\n");
}
 
