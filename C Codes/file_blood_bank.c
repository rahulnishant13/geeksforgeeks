#include <stdio.h>
#include <malloc.h>

struct user{
	int age;
	char * name;
	char * add;
	int bgrp;
	};

struct user b[100];

int main(int argc, char **argv)
{
	int n,i;
	printf("\n\tBlood Grp Codes \"O : 1\"  \" A : 2\"  \"B+ : 3\"  \"AB : 4\"");
	printf("\n\nEnter no of DONARS' : ");
	scanf("%d",&n);

	for(i=1;i<=n;i++){
		b[i].name = (char *) malloc(20); //VVI
		b[i].add = (char *) malloc(50); //VVI
		printf("\nEnter Name, Age, Add, BloodGrp: ");
		getchar();
		scanf("%[^\n]s",b[i].name);
		scanf("%d",&b[i].age);
		getchar();
		scanf("%[^\n]s",b[i].add);
		scanf("%d",&b[i].bgrp);
		}

	FILE *fp;
	fp = fopen("baba.txt","w");

	for(i=1;i<=n;i++){
		fprintf(fp,"%s\n",b[i].name);
		fprintf(fp,"%d\n",b[i].age);
		fprintf(fp,"%s\n",b[i].add);
		fprintf(fp,"%d\n\n",b[i].bgrp);
		}

	return 0;
}
