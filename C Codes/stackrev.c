#include <stdio.h>
#include <malloc.h>

struct node{
	char data;
	struct node * back;
	};

typedef struct node box;

int main(int argc, char **argv)
{
	box * top, * temp=NULL;
	char ch;
	while(ch != 't'){
	scanf("%c",&ch);
	top = (box *)malloc(sizeof(box));
	top->data = ch;
	top->back = temp;
	temp = top;
   }
   while(top != NULL){
   printf("%c",top->data);
   top = top -> back;
  }
	return 0;
}
