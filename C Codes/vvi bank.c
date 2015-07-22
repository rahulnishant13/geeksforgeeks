#include <stdio.h>
#include <malloc.h>

struct user{
	float ac;
	char * name;
	int bal;
	};

struct user b[100];

int main(int argc, char **argv)
{
	int n,i,j=0,am,t=0;

	printf("\nEnter no of acounts : ");
	scanf("%d",&n);

	for(i=1;i<=n;i++){
		b[i].name = (char *) malloc(15); //VVI
		printf("\nAcount Code : %d",i);
		printf("\nEnter Acount Name & Balance : ");
		scanf("%f %[^\n]s ",&b[i].ac,b[i].name);
		scanf("%d",&b[i].bal);
		}

	/*for(i=0;i<n;i++){
		printf("\nAcount : %f",b[i].ac);
		printf("\t\tName : %s",b[i].name);
		printf("\t\tBalance : %d",b[i].bal);
		}*/

	for(i=1;i<=n;i++){
		if(b[i].bal < 100){
			printf("\nAcount : %f",b[i].ac);
		    printf("\t\tName : %s",b[i].name);
		    printf("\t\tBalance : %d",b[i].bal);
			}
		}

while(t == 0){
printf("\nFor Withdrawl enter 1, For Deposit enter 2 With ur ACOUNT code : ");
scanf("%d%d",&j,&i);

printf("\nEnter Amount : ");
scanf("%d",&am);

	if(j == 1){
		b[i].bal = b[i].bal - am;
		}
	else if(j == 2){
		b[i].bal = b[i].bal + am;
		}
	        
	        printf("\nAcount : %f",b[i].ac);
		    printf("\t\tName : %s",b[i].name);
		    printf("\t\tBalance : %d",b[i].bal);

    int c;
    printf("\nPress 1 for more transition : ");
    scanf("%d",&c);
    
    if(c == 1){
		t = 0;
		}
	else{
		t = 1;
		}

}
	return 0;
}
