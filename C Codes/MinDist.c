#include<stdio.h>
#include<math.h>

int main()
{
	float md,va,vb,x,y;
	double ta,tb;
	scanf("%f",&x);
	scanf("%f",&y);
	scanf("%f",&va);
	scanf("%f",&vb);
	if(va<0||vb<0||x<0||y<0)
	{
		printf("Invalid Input");
	}
	else
	{
	ta= sqrt((x*x)+(y*y));
	x=x-va;
	y=y-vb;
	tb=sqrt((x*x)+(y*y));
	while(ta>tb)
	{
		ta=tb;
		x=x-va;
		y=y-vb;
		tb=sqrt((x*x)+(y*y));
	}
	if(ta==0.00000000000)
	{
                          printf("0.0");
                          }   
    else
    {           
	printf("%.11f",ta);
}
	}
	return 0;
}
