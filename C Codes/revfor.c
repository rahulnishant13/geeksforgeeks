#include <stdio.h>
#define max 50

void rev(char a[], int i){
	int k,j,c;
	for(k=0, j=i; k<j ; k++, j--){
		c = a[k];
		a[k] = a[j];
		a[j] = c;
		}
	}

int main(int argc, char **argv)
{
	int i,k;
	char a[max];
	
	for(i=0;i< max; i++){
		scanf("%c",&a[i]);
		if(a[i] == 't')
		   break;
		}
printf("\n");
	rev(a,i);
	for(k=0;k<=i;k++)
	printf("%c",a[k]);
	return 0;
}
