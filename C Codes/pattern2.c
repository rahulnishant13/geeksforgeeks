#include <stdio.h>
#include <conio.h>
int main(int argc, char **argv)
{
	int i,j,k,l=0,m=0;
	char n,o;
	scanf("%c",&n);
	o = n;
	
	for(k='A';k<=o;k++){
	for(i='A';i<=n;i++){
		printf("%c ",i);
		}
    for(m=l;m > 0;m--){
	printf("    ");
    }
    if(k=='A'){
               for(j=n-1;j>='A';j--){
		printf("%c ",j);
		}     }
  else{
       printf("\b\b");
	for(j=n;j>='A';j--){
		printf("%c ",j);
		}}
		printf("\n");
        l++;
		n = n - 1;
	}
	getch();
	return 0;}
