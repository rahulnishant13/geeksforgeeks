#include <stdio.h>
#include <malloc.h>

struct node{
	int data;
	struct node *l,*r;
	};

typedef struct node box;

void insert(box ** root, box * br){
	if(*root == NULL){
		*root = br;
		}
	else{
		if(((*root)->data) <= (br->data)){
			insert(&((*root)->l),br);
			}
		else{
			insert(&((*root)->r),br);
			}
		}
	}

void printout(box * tree) {
   if(tree->l) printout(tree->l);
   printf("%d\t",tree->data);
   if(tree->r) printout(tree->r);
}

int main(int argc, char **argv)
{
	box *root, *br;
	root = NULL;
	int i,a,n=5;
	for(i=0;i<n;i++){
		br = (box*)malloc(sizeof(box));
		scanf("%d",&a);
		br->data = a;
		br->l = NULL;
		br->r = NULL;

		insert(&root,br);
		}
	printout(root);
	return 0;
}

