#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int detmat(int *,int);
int main()
{
	int *arr,n,i,j,pos,num;
	int sum;
	printf("\nEnter value of n for nXn matrix\n");
	scanf("%d",&n);
	arr=(int *)calloc(n*n,4);
	printf("\nEnter numbers of matrix row wise :\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&num);
			pos=i*n+j;
			arr[pos]=num;
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=i;j<n*n;j+=n)
		{
			printf("\t%d\t",arr[j]);
		}
		printf("\n");
	}
	sum=detmat(arr,n);
	free(arr);
	printf("\n\tThe value of Determinat is %d",sum);
	getch();
	return 0;
}
int detmat(int *arr,int order)
{
	int sign=1,i,j,k,count,*arr2;
	int newsize,newpos,pos;
	int sum=0;
	if(order==1)
	return(arr[0]);
	for(i=0;i<order;i++,sign*=-1)
	{
		newsize=(order-1)*(order-1);
		arr2=(int *)calloc(newsize,4);
		for(j=1;j<order;j++)
		{
			for(k=0,count=0;k<order;k++)
			{
				if(k==i)
				continue;
				pos=j*order+k;
				newpos=(j-1)*(order-1)+count;
				arr2[newpos]=arr[pos];
				count++;
			}
		}
		sum=sum+arr[i]*sign*detmat(arr2,order-1);
		free(arr2);
	}

	return(sum);
}
