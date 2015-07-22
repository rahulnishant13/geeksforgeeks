#include <stdlib.h>
#include <stdio.h>


struct tree_el {
   int val;
   struct tree_el * right, * left;
};

typedef struct tree_el node;

node * tree=NULL;

void insert( node * tre ,node * item) {
	//tree=tre;
   if(!(tre)) {
      tre = item;
      return;
   }
  
}

void printout(node * tree) {
   if(tree->left) printout(tree->left);
   printf("%d\n",tree->val);
   if(tree->right) printout(tree->right);
}

int main(int argc, char **argv)
{
   node * curr;
   int i;

   root = NULL;

   for(i=1;i<=10;i++) {
      curr = (node *)malloc(sizeof(node));
      curr->left = curr->right = NULL;
      curr->val = rand()%10;
      insert(tree, curr);
   }

   printout(tree);
   
   return 0;
}

