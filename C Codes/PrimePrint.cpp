#include <stdio.h>

int main()
{
	int i,j,k,l=1,num,count=0;
	float sum =0;
	scanf("%d",&num);
	for(i=2;i<=num;i++)
    {
		k = 0;
		for(j=1;j<=i/2;j++)
        {
			if(i % j == 0)
            {
				k++;
			}
			if(k > 1)
			    break;
	    }
    		if(k == 1)
            {
                 count++;
    			printf("%d ",i);
    		}
    		if(count%8 == 0)
            { 
              count =0;
              printf("\n"); 
            }
                 
	}
	return 0;
}

