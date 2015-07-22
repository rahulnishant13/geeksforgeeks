#include <stdio.h>
#include <conio.h>

int main(int argc, char **argv)
{
	int i,j,k,n,l=1;
	scanf("%d",&n);
	for(i=1;i <= n;i++){
		   for(j=n-i;j>0;j--){
			    printf("\t");
			  }
			for(k=1;k <= i && l<=n;k++){
			  printf("%d\t\t",l);
			  l++;}
			  printf("\n");
	}
	getch();
    getch();
	return 0;
}

