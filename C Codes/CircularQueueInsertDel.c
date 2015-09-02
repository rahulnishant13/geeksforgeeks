#include<stdio.h>
#include<conio.h>

#define SIZE 5
int front = -1;
int rear = -1;
int queue[SIZE];

//Function prototypes
void enqueue_cq(int item);
int dequeue_cq();

void main()
{
	int item, choice, cont = 1;
	clrscr();

	while(cont == 1)
	{
		printf("\n1.Enqueue into circular queue.\n");
		printf("\n2.Dequeue from circular queue.\n");

		printf("\nEnter your choice: ");
		scanf("%d",&choice);

		switch(choice)
		{
			case 1:
				printf("\nEnter the value of item: ");
				scanf("%d",&item);
				enqueue_cq(item);
				break;

			case 2:
				item = dequeue_cq();
				if(item != NULL)
				{
					printf("\nItem dequeued: %d\n",item);
				}				
				break;

			default:
				printf("\nInvalid choice.\n");
				break;
		}

		printf("\nDo you want to continue (1/0): ");
		scanf("%d",&cont);
	}

	getch();
}

//Function for push operation
void enqueue_cq(int item)
{
	int next;

	if(front == -1 && rear == -1)
	{
		front = front + 1;
		rear = rear + 1;
		queue[rear] = item;
		printf("\nItem enqueued: %d\n", item);
	}
	else
	{
		next = ((rear == (SIZE-1)) ? (rear % (SIZE-1)) : ((rear % (SIZE-1)) + 1));
		if(next == front)
		{
			printf("\nQueue is full. Enqueue not possible.\n");
		}
		else
		{
			rear = next;
			queue[rear] = item;
			printf("\nItem enqueued: %d\n", item);
		}
	}
}

//Function for pop operation
int dequeue_cq()
{
	int item = NULL;

	if(front == -1 && rear == -1)
	{
		printf("\nQueue is empty. Dequeue not possible.\n");
	}
	else
	{
		item = queue[front];
		queue[front] = NULL;

		if(front == rear)
		{
			front = -1;
			rear = -1;
		}
		else
		{
			front = ((front == (SIZE-1)) ? (front % (SIZE-1)) : ((front % (SIZE-1)) + 1));
		}
	}
	return(item);
}
