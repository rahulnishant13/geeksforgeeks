#include <stdio.h>

struct user{
	float ac;
	char * name;
	int bal;
	};

struct user b[100];

int main(int argc, char **argv)
{
	int n=3,i;
	
	
	
	for(i=1;i<=n;i++){
		//b[i].name = (char *) malloc(15); //VVI
		char c[30];
		printf("\nAcount Code : %d",i);
		printf("\nEnter Acount Name & Balance : ");
		scanf("%f%s%d",&b[i].ac,c,&b[i].bal);
		b[i].name = c;
		}

	for(i=0;i<n;i++){
		printf("\nAcount : %f",b[i].ac);
		printf("\t\tName : %s",b[i].name);
		printf("\t\tBalance : %d",b[i].bal);
		}
		
	return 0;
}

