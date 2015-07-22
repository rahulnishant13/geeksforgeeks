#include <stdio.h>
#include <malloc.h>


int main(int argc, char **argv)
{
	char * a, * b[20];
	int i,n,j,temp;

printf("Enter the no of name : ");
scanf("%d",&n);

	for(i=1;i<=n;i++){
		a = (char *) malloc(15);
		printf("Enter Name : ");
		getchar();
		scanf("%[^\n]s",a);
		b[i] = a;
		}

 for(i=1; i<=n ;i++)
  {
   for(j=i+1;j<=n;j++)
   {
     if((*b[i]) > (*b[j])){
				 temp = (b[i]);
		         (b[i]) = (b[j]);
		         (b[j]) = temp;
			 }
   }
  }

printf("\n\n");

	for(i=1;i<=n;i++){
		printf("%s\n",b[i]);
		}

	return 0;
}
