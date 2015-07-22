#include <stdio.h>
#include <malloc.h>

struct que{
	int data;
	struct que * link;
	}*num[10]={NULL};

int main(int argc, char **argv){

	int arr[]={15,124,3,78,194,26,36};
	int i,j,k=1,l,d;

	for(l=0;l<3;l++){
		for(i=0;i<7;i++){
			d = (arr[i]% (10*k));
			d /= k;

	struct que *temp=num[d],*last;

    if(num[d]==NULL){
			num[d]= (struct que*)malloc(sizeof(struct que));
			num[d]->data = arr[i];
			num[d]->link = NULL;
		  }
	else{
		while(temp != NULL){
				last =temp;
				temp = temp->link;
				}
		last->link = (struct que*)malloc(sizeof(struct que));
		temp = last->link;
		temp->data = arr[i];
		temp->link = NULL;
		}
	 }

	 for(i=0,j=0;(i<10);i++){
		 while(num[i] != NULL){
			 arr[j] = num[i]->data;
			 j++;
			 num[i] = num[i]->link;
			 }
		 }
			k = k*10;
		}

	 for(i=0;i<7;i++){
		printf("%d  ",arr[i]);
		}
	return 0;
}
