#include <stdio.h>

int main(int argc, char **argv)
{
	int i,j,k,l=1,num,input1,input2;
	float sum =0;
	freopen("input.txt","r",stdin);
	//freopen("out","w",stdout);
	scanf("%d",&num);
	while(l<=num){
		scanf("%d",&input1);
		scanf("%d",&input2);
	for(i=input1;i<=input2;i++){
		k = 0;
		for(j=1;j<=i/2;j++){
			if(i % j == 0){
				k++;
				}
				if(k > 1)
			      break;
			 sum++;
			}
		if(k == 1){
			printf("%d\n",i);
			}
		//sum += m;
		}
		
		l++;
	}
	printf("\nSum : %f\n",sum);
	return 0;
}

