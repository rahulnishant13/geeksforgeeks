#include <stdio.h>
#include <malloc.h>

int main(int argc, char **argv)
{
	char *b[5],* a,* d;
	int n,i;

printf("Enter No Of Name : ");
scanf("%d",&n);
getchar();

	for(i=0;i < n;i++){
		printf("\nEnter Name : ");
		a = (char *)malloc(50);
		scanf("%[^\n]s",a);
		getchar();
		b[i] = a;
		}

printf("\n\n");

	for(i=0;i < n;i++){
		d = b[i];
		printf("%c",*d);
		while(*(d) != ' '){
			d++;
			}
		while(*(d) != '\0'){
			printf("%c",*d);
			d++;
			}
		printf("\n");
		}

	return 0;
}
