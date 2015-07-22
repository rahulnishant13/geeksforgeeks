#include <stdio.h>

int main(int argc, char **argv)
{
	int a[50],i,j,n,temp,k;
	printf("Enter no of Elements : ");
	scanf("%d",&n);
	printf("Enter the Elements : ");
	for(k=0;k<n;k++){
		scanf("%d",&a[k]);
		}
	for(i=0;i<(n-1);i++){
		for(j=i+1;j>0;j--){
			if(a[j]<a[j-1]){
				temp = a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
				}
			else{
				break;
				}
			}
		}
	for(i=0;i<n;i++){
		printf("%d\t",a[i]);
		}
	printf("\n");
	return 0;
}
