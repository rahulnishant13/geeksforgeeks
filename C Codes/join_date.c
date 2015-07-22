#include <stdio.h>

struct date{
	int d, m, y ;
	}

struct employee{
	int empcode[6] ;
	char empname[20] ;
	struct date join_date ;
	float salary ;
	};

struct employee b[100];

int main(int argc, char **argv)
{
	int n,i,j=0,am,t=0;

	printf("\nEnter no of acounts : ");
	scanf("%d",&n);

	for(i=1;i<=n;i++){
		b[i].name = (char *) malloc(15); //VVI
		printf("\nAcount Code : %d",i);
		printf("\nEnter Acount Name & Balance : ");
		scanf("%f%s%d",&b[i].ac,b[i].name,&b[i].bal);
		}

	return 0;
}
