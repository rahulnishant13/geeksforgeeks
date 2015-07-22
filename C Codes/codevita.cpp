#include<stdio.h>
#include<stdlib.h>
int lcm(int,int);
int main()
{
int n,m,i,j,a,b,num;
	int sum=0,arr[107][107];
	scanf("%d%d",&n,&m);
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			a=i+1;
			b=j+1;
			num=lcm(a,b);
			arr[i][j]=num;
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			sum=sum+arr[i][j];
			
		}
	}
	printf("\n%d",sum);
	return 0;
}
int lcm(int a,int b)
{
	int max;
  max=((a>b) ? a : b); 
  while(1)
  {
      if(max%a==0 && max%b==0)
        break;
      max++;
  }
  return max;
}
