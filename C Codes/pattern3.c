#include <stdio.h>
#include <conio.h>
int main(int argc, char **argv)
{
	char a[]="ABCDEFGFEDCBA";
	int i,j;
	for(i=6,j=6;  i>=0, j<=12;  i--,j++){
		printf("\n%s",a);
		if(i == j){
			a[i] = ' ';
			}
		else{
			a[i] = a[j] = ' ';
			}
			//printf("%d",i);
		}
		getch();
	return 0;
}

