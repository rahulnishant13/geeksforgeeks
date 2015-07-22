#include<stdio.h>
#include<math.h>
int main()
{
	int i,n;
	double fact=1.0,b,p,r;
	printf("Enter the number whose factorial is required\n");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	fact=i*fact;
	printf("%.15E\n",fact);
	printf("%G\n",fact);
	printf("enter the number and its power to calculate\n");
	scanf("%lf%lf",&b,&p);
	r=pow(b,p);
	printf("The result is %E\n",r);
	printf("The result is %G\n",r);
	return 0;
}
